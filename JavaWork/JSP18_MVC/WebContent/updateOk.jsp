<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%	// Controller로부터 결과 데이터 받음
	// parameter 받아오기
	// updateOk를 통해 update를 성공했는지 확인하고,
	// updateOkUID를 통해 uid 값을 받아오기 
	// 나중에 수정 성공시 location.href를 실행하기 위해서는 uid 값이 필요
	int cnt = (Integer)request.getAttribute("updateOk");
	int uid = (Integer)request.getAttribute("updateOkUID");
%>

<% if(cnt == 0) { %>
		<script>
			alert('수정 실패');
			history.back();
		</script>
<% } else { %>
		<script>
			alert('수정 성공');
			location.href = "view.do?uid=<%=uid%>";
		</script>
<% } %>