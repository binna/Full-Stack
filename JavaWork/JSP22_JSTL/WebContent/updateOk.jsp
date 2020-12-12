<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<c:choose>
	<c:when test="${result == 0}">
		<script>
			alert('수정 실패');
			history.back();
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert('수정 성공');
			// 내부함수 param을 사용하면 uid 값을 받아 올 수 있음...!!
			location.href = "view.do?uid=${param.uid}";
		</script>
	</c:otherwise>

</c:choose>