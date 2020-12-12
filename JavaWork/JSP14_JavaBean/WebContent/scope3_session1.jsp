<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="cnt" class="com.lec.beans.CountBean" scope="session"/>
<jsp:setProperty name="cnt" property="count"/>

<h3>session1<br>cnt의 getCount 호출</h3>

<jsp:getProperty name="cnt" property="count"/><br>

<a href="scope3_session2.jsp">session2으로...</a>