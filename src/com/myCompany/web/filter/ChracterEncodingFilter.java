package com.myCompany.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ChracterEncodingFilter implements Filter {

	private String encoding;
	
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// 서블릿의 init과 비슷함, 처음에 한번만 시행하고 다음부터는 doFilter를 시행함
		System.out.println("CharacterEncodingFilter init run");
		encoding = filterConfig.getInitParameter("encoding");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
	// 다음으로 넘겨라 라는 메소드 매개값이 chain
			throws IOException, ServletException {
		// 그래서 여기서 미리 전처리를 해야함
		// 전처리
		System.out.println("CharacterEncodingFilter doFilter run");
		request.setCharacterEncoding(encoding);
		
		// 서블릿으로 이동
		chain.doFilter(request, response); // 이코드가 실행되면 다음으로 넘어감, 서블릿으로 넘어감
		
	}

	
	
}
