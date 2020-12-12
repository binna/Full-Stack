<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>EL 내장객체</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String[] hobby = request.getParameterValues("hobby");
%>
아이디 : <%= id %><br>
비밀번호 : <%= pw %><br>
취미 : 
<% for(int i = 0; i < hobby.length; i++) { %>
		<%= hobby[i] %>
<% } %>
<hr>

아이디 : ${param.id}<br>
비밀번호 : ${param.pw}<br>
취미  : ${paramValues.hobby[0]}
	${paramValues.hobby[1]}
	${paramValues.hobby[2]}<br>
<hr>

아이디 : ${param["id"]}<br>
비밀번호 : ${param["pw"]}<br>
취미  : ${paramValues["hobby"][0]}
	${paramValues["hobby"][1]}
	${paramValues["hobby"][2]}<br>
<hr>

applicationScope : ${applicationScope.application_name}<br>
sessionScope : ${sessionScope.session_name}<br>
pageScope : ${pageScope.page_name}<br>
requestScope : ${requestScope.request_name}<br>
<hr>

context 초기화 파라미터<br>
${initParam.con_name}<br>
${initParam.con_id}<br>
${initParam.con_pw}<br>
<hr>

<!-- 프론트 엔드의 /는 도메인 뒤에,
	  백엔드에서의 /는 ContextPath 뒤에 -->
ContextPate<br>
<%= request.getContextPath() %><br>
${pageContext.request.contextPath}<br>

<!-- ContextPate를 직접 기재해도 되나 이런 경우
	 ContextPath명이 변경되면 모두 변경해야한다는 번거로움이 있다.
	  이러한 번거로움을  ${pageContext.request.contextPath}을 이용하면 
	  해소할 수 있다. -->
<a href="/JSP21_EL/el_form.jsp">입력폼</a><br>
<a href="${pageContext.request.contextPath}/el_form.jsp">입력폼</a>

</body>
</html>