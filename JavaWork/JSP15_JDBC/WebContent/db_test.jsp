<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- JDBC 관련 import --%>
<%@ page import = "java.sql.*" %>
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
	// * 여기에 쿼리문을 작성해준다.
%>

<%
	try {
		Class.forName(DRIVER);
		out.println("드라이버 로딩 성공" + "<br>");
		conn = DriverManager.getConnection(URL, USERID, USERPW);
		out.println("conn 성공" + "<br>");
		
		// 트랜젝션 실행
		// * 여기에 트랜젝션 실행문을 기재한다.
		
	} catch(Exception e) {
		e.printStackTrace();
		// * 여기서 예외 처리를 하든지, 예외 페이지를 설정해줘야 한다.
		
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

