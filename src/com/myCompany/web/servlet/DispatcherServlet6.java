package com.myCompany.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet6 extends HttpServlet {
	

	@Override
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 실행");
		String title = request.getParameter("title");
		String content = request.getParameter("content"); // 
		// request에 저장하는 이유 : jsp에서 데이터를 사용할 때 jsp에 바로 데이터를 줄 수가 없음
		// 데이터를 전달하는 메소드가 없음 그래서 공유 객체
		// 그래서 서블릿에서도 쓰고 jsp에서도 쓰고
		// service 메소드에서 request 매개 변수가 바로 공유 객체임
		// 클라이언트가 요청할 때 공유 객체가 생김
		// 응답이 가면 그 즉시 공유 객체는 없어짐
		
//		System.out.println("name: " + name);
//		System.out.println("age: " + intAge);
		
		request.setAttribute("title", title);
		request.setAttribute("content", content); // 키와 값같은 방식임
		
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
		
		rd.forward(request, response);
		
		
		
	}
	
	@Override
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 실행");
		
		// request.setCharacterEncoding("UTF-8");
		
		String title = request.getParameter("title");
		String content = request.getParameter("content"); // 
		
		request.setAttribute("title", title);
		request.setAttribute("content", content); // 키와 값같은 방식임
		
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
		
		rd.forward(request, response);
		
		
		
	}
	
	
	
	}

