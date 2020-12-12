package com.lec.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 방법2: Servlet 파일에 초기화 파라미터를 직접 기술하는 방법
//		1) Servlet 클래스 작성
//		2) @WebInitParam 에 초기화 파라미터를 작성
//			import javax.servlet.annotation.WebInitParam;
//		3) ServletConfig의 메소드를 이용해서 데이터를 사용(접근)
//		   ServletConfig의 getInitParameter()메소드를 이용해서 접근할 수 있다.
@WebServlet(urlPatterns = {"/InitS"},
initParams = {
		@WebInitParam(name="id", value="test11"),
		@WebInitParam(name="pw", value="1000"),
		@WebInitParam(name="local", value="Pusan")
})
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InitServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// Ctrl + T : 클래스 족보 확인
		// ServletConfig 의 메소드를 사용.
		String id = getInitParameter("id");
		String pw = getInitParameter("pw");
		String local = getInitParameter("local");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("id : " + id + "<br>");
		out.println("pw : " + pw + "<br>");
		out.println("local : " + local + "<br>");
		
		out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}