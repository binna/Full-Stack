<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 이 페이지는 에러 헨들링을 위한 페이지임을 명시해줘야 함 -->
<%@ page isErrorPage = "true" %>
<!-- 우리가 만든 에러페이지는 에러라고 알려주기 위한 정상적인 페이지,
	  그래서 response.setStatus(200)을 이용해서 
	  현재 이 페이지는 정상적인 페이지라고 알려주는 것임 -->
<%response.setStatus(200);%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>에러 안내</title>
</head>
<body>
에러가 발생했습니다....<br>
예외타입은 : <%=exception.getClass().getName()%><br>
예외 메시지는 : <%=exception.getMessage()%>

</body>
</html>