package com.myCompany.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet5 extends HttpServlet {
	

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		int intAge = Integer.parseInt(age);
		
//		System.out.println("name: " + name);
//		System.out.println("age: " + intAge);
		
//		request.setAttribute("name", name);
//		request.setAttribute("age", intAge); // 키와 값같은 방식임
		
		
		ServletContext servletContext = request.getServletContext();
		servletContext.setAttribute("name", name); // 계속 살아 있음, 계속남아있어서 다음 요청에도 쓸 수 있음
		servletContext.setAttribute("age", age);
		
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("/WEB-INF/view/dispatcher5.jsp");
		// 요청이 들어왔을때 생성, 응답이 왔을때 소멸
		
		rd.forward(request, response);
		
		
		
	}
	
	
		
	}

