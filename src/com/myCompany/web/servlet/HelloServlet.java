package com.myCompany.web.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("helloServlet service run");
		// http://localhost:8080/servletJspProgramming/hello(hello를 실행하면 그 뒤에 것이 실행되는 것)
		//super.service(req, resp);
	}
	
	
}
