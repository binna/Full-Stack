<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 1. page 지시자 태그를 사용한 예외 처리 --%>
<%-- URL은 변동 없음, 내부적으로 포워딩 효과 --%>
<%@ page errorPage="error.jsp" %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>예외발생1</title>
</head>
<body>
<%= request.getParameter("id").toUpperCase() %>

</body>
</html>