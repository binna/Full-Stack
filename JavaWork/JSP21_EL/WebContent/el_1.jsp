<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>EL</title>
</head>
<body>
<h3>Expression Language</h3>
${10}<br>
${99.99}<br>
${"ABC"}<br>
${true}<br>
<hr>
<h3>EL의 연산자</h3>
${1 + 2}<br>
${1 - 2}<br>
${1 * 2}<br>
${1 / 2}<br>
${1 > 2}<br>
${1 < 2}<br>
${(1 < 2) ? 1 : 2}<br>
${(1 > 2) || (1 < 2)}<br>
<hr>

<%
	// 지금 작성한 변수는 자바 변수!
	int num = 10;
%>
<%-- EL은 JAVA 언어가 아니다.
	 JAVA 변수 그대로 표현은 안되나
	  특별히 에러가 아님! 아무것도 출력이 되지 않을뿐! --%>
num: ${num}<br>
num: <%= num %> <%-- 자바변수는 <%= %>로 표현을 해야 출력 가능 --%>
</body>
</html>