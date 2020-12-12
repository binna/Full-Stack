package com.command.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lec.beans.WriteDAO;

public class DeleteOkCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int cnt = 0;
		
		WriteDAO dao = new WriteDAO();	// DAO 객체 생성
		
		// 매개변수 받아오기
		int uid = Integer.parseInt(request.getParameter("uid"));
		
		try {
			// 트랜잭션 수행
			cnt = dao.deleteByUid(uid);
			
		} catch(SQLException e) {
			e.printStackTrace();
			
		}

		// "update"란 name으로 request에 arr 값 전달
		// 즉, request에 담아서 컨트롤러에 전달되는 셈!
		request.setAttribute("deleteOk", cnt);
	}

}