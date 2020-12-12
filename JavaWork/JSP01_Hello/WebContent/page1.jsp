<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>page1</title>
</head>
<body>
<h1>page1</h1>

<!-- 서버에서 리퀘스트 발생함 -->
<a href="Hello.jsp">hello</a><br>

<!-- history.back() : 이전페이지로 돌아가기 
 					     리퀘스트 발생 안함, 
 					     브라우저에거 기억하는 이전 페이지로 돌아가는 것-->
<button onclick="history.back()">back</button>

</body>
</html>