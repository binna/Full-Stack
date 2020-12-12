<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- JDBC 관련 import --%>
<%@ page import = "java.sql.*"%>
    
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

<%!
	// JDBC 관련 기본 객체변수
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;	// SELECT 결과, executeQuery()
	int cnt = 0;			// DML 결과, executeUpdate()
	
	// Connection 에 필요한 값 세팅
	final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	final String USERID = "scott0316";
	final String USERPW = "tiger0316";
%>

<%!
	// 쿼리문 준비
	final String sql_insert = "INSERT INTO test_write "
		+ "(wr_uid, wr_subject, wr_content, wr_name) "
		+ "VALUES(test_write_seq.nextval, ?, ?, ?)"
		;
%>

<%
	try {
		Class.forName(DRIVER);
		out.println("드라이버 로딩 성공" + "<br>");
		conn = DriverManager.getConnection(URL, USERID, USERPW);
		out.println("conn 성공" + "<br>");
		
		// 트랜젝션 실행
		pstmt = conn.prepareStatement(sql_insert);
		
		pstmt.setString(1, subject);
		pstmt.setString(2, content);
		pstmt.setString(3, name);
		
		cnt = pstmt.executeUpdate();
		
	} catch(Exception e) {
		e.printStackTrace();	// 에러를 콘솔창에서 보고 싶을때
		//throw e;	// 에러를 직접 웹 페이지에서 보고 싶을때
		// * 여기서 예외 처리, 콘솔창이나 에러 페이지를 통해 에러 확인이 가능함
		
	} finally {
		// 리소스 해제
		try {
			if(rs != null) {rs.close();}
			if(stmt != null) {stmt.close();}
			if(pstmt != null) {pstmt.close();}
			if(conn != null) {conn.close();}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
%>

<%-- 위 트랜젝션이 마무리되면 페이지 보여주기 --%>
<% if(cnt == 0) { %>
		<script>
			alert('등록 실패!!');
			history.back();	// 브라우저가 직전에 직전 페이지(입력중 페이지로)
		</script>
<% } else {%>
		<script>
			alert('등록 성공, 리스트를 출력합니다!');
			location.href = "list.jsp";
		</script>
<% } %>