package com.command;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lec.beans.CategoryDAO;
import com.lec.beans.CategoryDTO;

public class CateListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		CategoryDAO dao = new CategoryDAO();
		CategoryDTO[] arr = null;
		
		// ajax response 에 필요한 값들
		StringBuffer message = new StringBuffer();
		String status = "FAIL";   // 기본 FAIL
		
		int depth = Integer.parseInt(request.getParameter("depth"));
		String parent = request.getParameter("parent");
		
		try {
			// 카테고리 읽기
			// parent "", 0, null
			if(parent == null || parent.equals("") || parent.equals("0")) {
				arr = dao.selectByDepthAndParent(depth);
			} else {	// parent 값이 있을때
				arr = dao.selectByDepthAndParent(depth, parent);
			}
			
			if(arr == null) {
				message.append("[리스트할 데이터가 없습니다]");
			} else {
				status = "OK";
			}
			
		} catch(SQLException e) {
			message.append("[트랜잭션 에러:" + e.getMessage()+ "]");
		} // end try
		
		request.setAttribute("status", status);
		request.setAttribute("message", message.toString());
		
		request.setAttribute("list", arr);

	} // end execute()

} // end Command