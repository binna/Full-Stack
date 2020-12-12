package com.lec.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConPath")
public class ContextPath extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ContextPath() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// URL : Uniform Resource Locator
		StringBuffer url = request.getRequestURL();
		
		// URI : Uniform Resource Identifier
		String uri = request.getRequestURI();
		
		// Context Path : 웹어플리케이션을 구분하기 위한 path를 말함(톰캣이 WAS)
		String conPath = request.getContextPath();
		
		// domain 추출하기
		String url_domain = request.getScheme() + "://" + request.getServerName()
			+ " : " + request.getServerPort();
		// 물리적인 servletContextName, context Path가 아니다
		ServletContext context = request.getServletContext();
		String ServletContextName = context.getServletContextName();
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=utf-8");
		out.println("<hr>");
		out.println("URL: " + url + "<br>");
		out.println("URI: " + uri + "<br>");
		out.println("ContextPath: " + conPath + "<br>");
		out.println("URL_domein: " + url_domain + "<br>");
		out.print("Servlet ContextName : " + ServletContextName + "<br>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}