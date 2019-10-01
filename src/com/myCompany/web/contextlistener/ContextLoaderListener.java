package com.myCompany.web.contextlistener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
	
	// Listener - WAS에 시작과 끝에 뭘 할게 있으면 이것을 사용, web에 등록, 톰켓이 이것을 알아차려야해
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("contextInitialized run");
		ServletContext application = sce.getServletContext();
		String contextConfigLocation = application.getInitParameter("contextConfigLocation");
		System.out.println(contextConfigLocation + "을 읽고 Spring WebApplicationContext를 구성합니다");
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestroyed run");
		
		
	}
	
	
	
	
}
