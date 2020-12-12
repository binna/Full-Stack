<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 처리만 되는 페이지임, 
	  무언가를 보여주는 페이지가 아님, 
	  그렇기 때문에 html 삭제 -->
<%
	String cookieName = "userid";
	String cookieValue = "";
	
	Cookie cookie = new Cookie(cookieName, cookieValue);
	cookie.setMaxAge(0);	// 쿠키 제거!
	response.addCookie(cookie);
%>

<script>
alert('로그 아웃 되었습니다.');
location.href = 'login.jsp';
</script>