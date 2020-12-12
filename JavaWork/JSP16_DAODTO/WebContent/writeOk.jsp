<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- DAO bean 객체 생성 -->
<jsp:useBean id="dao" class="com.lec.beans.WriteDAO"/>

<%--    
<% 
	// post 방식은 한글 인코딩이 반드시 필요!(누락되지 않도록 조심하기!!)
	request.setCharacterEncoding("utf-8");

	// 입력한 값 받아오기
	String name = request.getParameter("name");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");
	
	// 백엔드에서 폼 유효성 체크, 검증하기
	// name, subject 는 비어 있으면 안된다(not null)
	// null 이거나 빈 문자열이면 이전 화면으로 돌아가기
	if(name == null || subject == null ||
		name.trim().equals("") || subject.trim().equals("")) {
%>
		<script>
			alert('작성자 이름, 글 제목은 필수입니다!');
			history.back();	// history.go(-1)
		</script>
<%
		return;	// ★ [매우 매우 중요!] 더이상 JSP 프로세싱 하지 않도록 종료 ★
	}
%>
--%>

<%
	request.setCharacterEncoding("utf-8");	// 한글 인코딩 꼭
%>

<jsp:useBean id="dto" class="com.lec.beans.WriteDTO"/>
<jsp:setProperty property="*" name="dto"/>

<%
	// DAO 사용한 트랜젝션
	//int cnt = dao.insert(subject, content, name);
	int cnt = dao.insert(dto);
%>

<% if(cnt == 0) { %>
		<script>
			alert('등록 실패!!');
			history.back();	// 브라우저가 직전에 직전 페이지(입력중 페이지로)
		</script>
<% } else { %>
		<script>
			alert('등록 성공, 리스트를 출력합니다!');
			location.href = "list.jsp";
		</script>
<% } %>