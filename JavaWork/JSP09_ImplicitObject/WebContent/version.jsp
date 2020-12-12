<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>version</title>
</head>
<body>
<h3>버젼확인</h3>

<!-- 
	서블릿, JSP, 톰캣 버젼 확인  : 내장객체사용
	[중요!] 앞의 대문자 JspFactory 이면 클래스, getEngineInfo() 이면 static 메소드
			앞의 소문자 application이고 getServerInfo(), getMajorVersion() 이면 내장객체..!!
-->
 - 서버 : <%=application.getServerInfo() %> <br>
 - 서블릿 : <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %><br>
 - JSP : <%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %>
</body>
</html>