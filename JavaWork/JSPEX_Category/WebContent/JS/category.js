var depth = 1;
var parent = 0;

$(document).ready(function(){
	// 첫 로딩할때 보여지기 위해
	selectLoad(depth, parent);

	// 첫번째 select 값이 선택될때 하위 선택 박스 활성화..!!
	$("#depth_first").change(function(){
		window.depth = 2;
		window.parent = $("#depth_first option:selected").val();
		
		
		if(window.parent != 0) {
			selectLoad(depth, parent);
		} else {
			$("#depth_second").attr('disabled', true);
			$("#depth_second option").remove();
			$("#depth_third").attr('disabled', true);
			$("#depth_third option").remove();
		}
	});
	
	// 두번째 select 값이 선택될때 하위 선택 박스 활성화..!!
	$("#depth_second").change(function(){
		window.depth = 3;
		window.parent = $("#depth_second option:selected").val();
		
		if(window.parent != 0) {
			selectLoad(depth, parent);
		} else {
			$("#depth_third").attr('disabled', true);
			$("#depth_third option").remove();
		}
	});

});


function selectLoad(depth, parent){
	
	$.ajax({
		url : "cate_list.ajax?depth=" + depth + "&parent=" + parent
		, type : "GET"
		, cache : false
		, success : function(data, status){
			if(status == "success"){
				selectOption(data, depth, parent);
			}			
		}
	});
	
} // end selectLoad()

function selectOption(jsonObj, depth, parent){
	result = ""; 
	
	if(jsonObj.status == "OK"){
		
		var count = jsonObj.count;
		
		var i;
		var items = jsonObj.data;   // 배열
		result="<option value='0' selected>--선택하세요--</option>\n"
		for(i = 0; i < count; i++){
			result += "<option value='" + items[i].uid + "'>" + items[i].name + "</option>\n";
		} // end for
		
		if(depth == 1) {
			$("#depth_first").attr('disabled', false);
			$("#depth_first").html(result);
		}
		if(depth == 2) {
			$("#depth_second").attr('disabled', false);
			$("#depth_second").html(result);
		}
		if(depth == 3) {
			$("#depth_third").attr('disabled', false);
			$("#depth_third").html(result);
		}
		
		return true;
	} else {
		alert(jsonObj.message);
		return false;
	}
	return false;
} // end selectOption()