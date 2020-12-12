// 익명함수
(function(){
    // 바다
    var $waterFront = $("#water-front");
    var $waterBack = $("#water-back");

    // 파도는 계속 넘실거릴것이다...!!
    (function loopSea(){
        $waterFront
            .animate({'bottom' : '-65px', 'left' : '-30px'}, 500)
            .animate({'bottom' : '-60px', 'left' : '-25px'}, 500);

        $waterBack
            .animate({'bottom' : '15px', 'left' : '-20px'}, 500)
            .animate({'bottom' : '10px', 'left' : '-25px'}, 500);

        $.when($waterFront, $waterBack).done(loopSea);
    })();

    // 구름
    var $cloud1 = $("#cloud-group-1");
    var $cloud2 = $("#cloud-group-2");

    // 구름도 계속 뭉게 뭉게할 것이다..!!
    (function loopCloud(){
        $cloud1
            .animate({'left' : '-720px'}, 10000)
            .animate({'left' : '0px'}, 0);

        $cloud2
            .animate({'left' : '0px'}, 10000)
            .animate({'left' : '720px'}, 0, loopCloud);
    })();

    // 보트
    var $boat = $('#boat');
    // 물음표
    var $questionMark = $('#question-mark');
    // title 2개, form 
    var $title1 = $('#title1');
    var $title2 = $('#title2');
    var $form = $('#form');

    $boat.css({'left' : '-220px'});   // 최초, 화면 왼쪽 바깥의 위치
    $questionMark.css({'opacity' : 0});    // 최초 투명
    $title1.css({'opacity' : 0});   // 최초 투명
    $title2.css({'opacity' : 0});   // 최초 투명
    $form.css({'left' : '370px'});  // 최초, 화면 왼쪽 바깥의 위치

    // 페이지 로딩될때 단 한번 실행..!!
    // 한번 끄떡 움직이는 것까지 함께 구현
    // 방법1 : animate() + callback
    // [하지만] 이 방법은 콜백 지옥이 만들어질 수 있다 (가독성이 나쁨)
    //$boat.animate({'left' : '20px'}, 2000, function(){
    //    loopBoat();
    //    $questionMark.delay(500).animate({'opacity' : 1}, 1000, 
    //        /* $questionMark 끝나고 실행되는 함수 */function(){
    //            $title1.animate({'opacity' : 1}, 1000, function(){
    //                $title2.animate({'opacity' : 1}, 1000, function(){
    //                    $form.animate({'left' : 0}, 500); // end $form
    //                });// end title2
    //            }); // end $title1
    //        }); // end $questionMark
    //}); // end $boat

    // 방법2 : $.when()   .then() 사용, 가독성이 좋음..!!
    //$.when($boat.animate({'left' : '20px'}, 2000))
    //    .then(function(){
    //        loopBoat();
    //        return $.when($questionMark.delay(500).animate({opacity : 1}, 1000));
    //    })
    //    .then(function(){
    //        return $.when($title1.animate({'opacity' : 1}, 1000));
    //    })
    //    .then(function(){
    //        return $.when($title2.animate({'opacity' : 1}, 1000));
    //    })
    //    .then(function(){
    //        //$form.animate({'left' : 0}, 500);
    //        $form.animate({'left' : 0}, 500, reload);
    //    })
    //    ;

    // 방법2 : 단일 애니메이션의 연속인 경우 promise() 만으로 가능
    $boat.animate({'left' : '20px'}, 2000).promise()
        .then(function(){
            loopBoat();
            return $questionMark.delay(500).animate({opacity : 1}, 1000).promise();
        })
        .then(function(){
			return $title1.animate({'opacity' : 1}, 1000).promise();
		})
		.then(function(){
			return $title2.animate({'opacity' : 1}, 1000).promise();
		})
		.done(function(){
			$form.animate({'left' : 0}, 500);
		})
    ;

    // 보트가 계속 위 아래로 흔들 흔들 구현
    function loopBoat(){
        $boat
        .animate({'bottom' : '15px'}, 500)
        .animate({'bottom' : '25px'}, 500, loopBoat)
    }

    
    function reload(){
        setTimeout(function(){
            location.reload();
        }, 5000);
    }
    
})()