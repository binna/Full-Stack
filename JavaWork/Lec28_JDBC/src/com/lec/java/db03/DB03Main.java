package com.lec.java.db03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lec.java.db.Query;

// 공통적으로 사용하는 상수들 인터페이스에 담아서 처리.
public class DB03Main implements Query {
	
	//Statement 자유로운 영혼, 정해져 있지 않다, 하나 만들어 넣고 sql문 바꿔가면서 사용할 수 있다
	//PreparedStatement 정해져있다, sql문 바꿔가면서 사용할 수 없다,
	//                  바꾸고 싶다면 close 하고 새롭게 만들어야 한다.

	public static void main(String[] args) {
		System.out.println("DB 3 - PreparedStatement");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// OracleDriver 클래스를 메모리에 로딩
			Class.forName(DRIVER);
			System.out.println("드라이버 로딩 성공");
			
			// DB Connection
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("Connection 성공");	// 1, 2, 3 중에 여기가 가장 많이 시간 걸림
			
			pstmt = conn.prepareStatement(SQL_INSERT);
			// "INSERT INTO test_member VALUES(?, ?, ?)"
			// 첫번째 ? 는 1부터 시작!
			// 장점 : 직접 + 넣어서 조립할 필요가 없다!!
			pstmt.setInt(1, 10);
			//pstmt.setString(1, "호에엥... 에러난다");	// 타입이 달라서 에러
			pstmt.setString(2, "헐크");
			pstmt.setString(3, "2000-10-10");
			//pstmt.setString(3, "꾸엉 꾸엉 에러난다");	// 타입이 달라서 에러
			int cnt = pstmt.executeUpdate();	// DML 명령어, int 리턴
			System.out.println(cnt + " 개 행(row) INSERT 성공");
			
			// 많이 발생할 수 있는 에러 : 누락하면 안되고 타입이 달라서는 안된다..!!
			// java.sql.SQLException: 인덱스에서 누락된 IN 또는 OUT 매개변수:: 3
			// java.sql.SQLSyntaxErrorException: ORA-01722: invalid number
			// java.sql.SQLDataException: ORA-01841: (full) year must be between -4713 and +9999, and not be 0
			
			System.out.println();
			System.out.println("UPDATE");
			// sql문을 바꿀려고 하면 자원을 close()를 해주고 새롭게 만들어줘야 한다!
			pstmt.close();
			pstmt = conn.prepareStatement(SQL_UPDATE_BIRTHDATE);
			// "UPDATE test_member SET mb_birthdate = ? WHERE mb_no = ?"
			pstmt.setString(1, "2020-01-01");
			pstmt.setInt(2, 10);
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + " 개(row) INSERT 성공");
			
			System.out.println();
			System.out.println("SELECT");
			pstmt.close();
			pstmt = conn.prepareStatement(SQL_SELECT_ALL);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String no = rs.getString(COL_LABEL_NO);
				String name = rs.getString(COL_LABEL_NAME);
				String birthdate = rs.getString(COL_LABEL_BIRTHDATE);
				
				System.out.println(no + " | " + name + " | " + birthdate);
			}
		
		
		
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {rs.close();}
				if(pstmt != null) {pstmt.close();}
				if(conn != null) {conn.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	} // end main()

} // end class DB03Main






















