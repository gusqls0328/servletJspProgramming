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

public class DispatcherServlet7 extends HttpServlet {
	

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// application scope 범위의 객체를 저장
		
		ServletContext sc = request.getServletContext();
		if(sc.getAttribute("applicationCounter") == null) {
			Counter applicationCounter = new Counter();
			sc.setAttribute("applicationCounter", applicationCounter);
		}
		// 한번더 실행하면 덮어써짐
		// 그래서 같은 키가 존재하는지 확인해야해
		
		
		// session scope 범위의 객체를 저장
		HttpSession session = request.getSession();
		if(session.getAttribute("sessionCounter") == null) {
		Counter sessionCounter = new Counter();
		session.setAttribute("sessionCounter", sessionCounter);
		}
		
		// request scope 범위의 객체를 저장
		if(request.getAttribute("requestCounter") == null) {
		Counter requestCounter = new Counter();
		request.setAttribute("requestCounter", requestCounter);
		}
		
		
		// forward
		RequestDispatcher rd = request.getRequestDispatcher("/dispatcher8");
		rd.forward(request, response);
	}
	
	
	
	}

