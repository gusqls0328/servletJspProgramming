package com.myCompany.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet101 extends HttpServlet {
	
	private String x;
	private String y; // 필드를 선언하고, x,y를 필드를 선언해야만 서비스에서 사용가능
	
	
	
	
	
	
	public DispatcherServlet101() {
		System.out.println("disPatcherServlet() service run");
//		String x = config.getInitParameter("x");
//		System.out.println("전달 받은 x값은:" + x);
//		String y = config.getInitParameter("y");
//		System.out.println("전달 받은 x값은:" + y);
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init(ServletConfig config) run");

		x = config.getInitParameter("x");
		System.out.println("전달 받은 x값은:" + x);
		y = config.getInitParameter("y");
		System.out.println("전달 받은 y값은:" + y);
		
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		
		System.out.println("disPatcherServlet service run");
		//super.service(req, resp);
		int xvalue = Integer.parseInt(x);
		int yvalue = Integer.parseInt(y);
		int result = xvalue + yvalue;
		System.out.println("result: " + result);
		
		
	}
}
