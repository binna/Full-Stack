package com.command.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lec.beans.WriteDAO;
import com.lec.beans.WriteDTO;

public class UpdateOkCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int cnt = 0;
		
		WriteDAO dao = new WriteDAO();	// DAO 객체 생성
		
		// 입력한 값을 받아오기
		int uid = Integer.parseInt(request.getParameter("uid"));
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		
		try {
			
			// 트랜잭션 수행
			// 사용자가 입력한 값으로 변경
			cnt = dao.update(uid, subject, content);
			request.setAttribute("updateOk", cnt);
			
		} catch(SQLException e) {
			e.printStackTrace();
			
		} finally {
			// 무조건 아이디 값은 넘겨줘야함,
			// 이 아이디 값을 매개변수로 받고 view 화면으로 갈 것이기 때문에
			request.setAttribute("updateOkUID", uid);
			
		}

	} // end execute()

}
