package com.myCompany.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myCompany.web.dto.Counter;

public class DispatcherServlet8 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// application scope 범위의 객체를 가져오기
		ServletContext sc = request.getServletContext();
		Counter applicationCounter = (Counter)sc.getAttribute("applicationCounter");
		if(applicationCounter != null) {
		applicationCounter.setValue(applicationCounter.getValue() + 1);
		System.out.println("applicationCounter: " + applicationCounter.getValue());
		}
		
		
		// session scope 범위의 객체를 가져오기
		HttpSession session = request.getSession();
		Counter sessionCounter = (Counter)session.getAttribute("sessionCounter");
		if(sessionCounter != null) {
			sessionCounter.setValue(sessionCounter.getValue() + 1);
			System.out.println("sessionCounter: " + sessionCounter.getValue());
		}
		
		// request scope 범위의 객체를 가져오기
		Counter requestCounter = (Counter)request.getAttribute("requestCounter");
		if(requestCounter != null) {
			requestCounter.setValue(requestCounter.getValue() + 1);
			System.out.println("requestCounter: " + requestCounter.getValue());
		}
		
		
		// forward
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dispatcher8.jsp");
		rd.forward(request, response);
		
	}
	
	
	
	
	}

