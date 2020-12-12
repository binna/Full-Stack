<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<%! int age; %>
<% 
	String str = request.getParameter("age");
	age = Integer.parseInt(str);
	
	if(age >= 19) {
		response.sendRedirect("adult.jsp?age=" + age);
	} else {
		response.sendRedirect("underage.jsp?age=" + age);
	}
%>