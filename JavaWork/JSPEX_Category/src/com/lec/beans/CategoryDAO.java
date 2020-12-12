package com.lec.beans;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import common.D;

public class CategoryDAO {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// DAO 객체가 생성될때 Connection 도 생성된다.
	public CategoryDAO() {
		try {
			Class.forName(D.DRIVER);
			conn = DriverManager.getConnection(D.URL, D.USERID, D.USERPW);
			
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	// DB 자원 반납 메소드,
	public void close() throws SQLException {
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	} // end close()
	
	
	// ------------------------------------------------------------------------
	
	
	// ResultSet --> DTO 배열로 리턴
	public CategoryDTO[] createArray(ResultSet rs) throws SQLException {
		CategoryDTO[] arr = null;
		
		ArrayList<CategoryDTO> list = new ArrayList<CategoryDTO>();
		
		while(rs.next()) {
			int uid = rs.getInt("ca_uid");
			String name = rs.getString("ca_name");
			int depth = rs.getInt("ca_depth");
			int parent = rs.getInt("ca_parent");
			int order = rs.getInt("ca_order");
			
			
			CategoryDTO dto = new CategoryDTO(uid, name, depth, parent, order);
			list.add(dto);
			
		} // end while
		
		int size = list.size();
		
		if(size == 0) return null;
		
		arr = new CategoryDTO[size];
		list.toArray(arr);  // List -> 배열
		
		return arr;
	} // end createArray()
	
	// -----------------------------------------------------------------------------
	
	// depth와 parent로 카테고리 읽기  (order 오름차순 순서로), parent 값이 있을때
	public CategoryDTO[] selectByDepthAndParent(int depth, String parent) throws SQLException {
		CategoryDTO[] arr = null;
		
		parent = parent.trim();
		
		try {
			pstmt = conn.prepareStatement(D.SQL_CATEGORY_BY_DEPTH_N_PARENT);
			pstmt.setInt(1, depth);
			pstmt.setString(2, parent);
			rs = pstmt.executeQuery();
			
			arr = createArray(rs);
		} finally {
			close();
		}		
		
		return arr;
		
	} // end selectByDepthAndParent()
	
	// 카테고리 읽기  (order 오름차순 순서로), parent "", 0, null
	public CategoryDTO[] selectByDepthAndParent(int depth) throws SQLException {
		CategoryDTO[] arr = null;
		
		try {
			// IS NULL
			pstmt = conn.prepareStatement(D.SQL_CATEGORY_BY_DEPTH_N_PARENT_NULL);
			pstmt.setInt(1, depth);
			rs = pstmt.executeQuery();
			
			arr = createArray(rs);
		} finally {
			close();
		}		
		
		return arr;
		
	} // end selectByDepthAndParent()
	
}