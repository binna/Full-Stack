package com.command.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lec.beans.WriteDAO;
import com.lec.beans.WriteDTO;

public class ListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		WriteDAO dao = new WriteDAO();	// DAO 객체 생성
		WriteDTO[] arr = null;
		
		try {
			// 트랜젝션 수행
			arr = dao.select();
			
			// "list"란 name으로 request에 arr 값 전달
			// 즉, request에 담아서 컨트롤러에 전달되는 셈!
			request.setAttribute("list", arr);
			
		} catch(SQLException e) {
			// 만약에 CP 사용한다면
			// 여기서 NamingException도 처리해줘야 함
			e.printStackTrace();
		}
		
	}

}