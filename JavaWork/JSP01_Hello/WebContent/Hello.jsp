<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">

<!-- viewport는 웹 반응형을 위해 필요함 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>JSP 시작</title>
</head>
<body>
첫 JSP 파일입니다!!<br>

<a href="page1.jsp">page1</a><br>

<!-- ./ : 현재페이지
		  http://localhost:8082/JSP001_Hello/page2.jsp -->
<a href="./page2.jsp">page2</a><br>

<!-- / : 404 에러
		 http://localhost:8082/page3.jsp -->
<a href="/page3.jsp">page3</a>

</body>
</html>