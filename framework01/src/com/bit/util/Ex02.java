package com.bit.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex02 implements Filter {
	String encoding;

	@Override
	public void destroy() {
		System.out.println("Filter destroy...");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Filter doFilter..."+encoding);
		req.setCharacterEncoding(encoding);
		System.out.println("before filter ex02... ");
		chain.doFilter(req, res);
		System.out.println("after filter ex02... ");
		return;
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("Filter init..."+config.toString());
		encoding=config.getInitParameter("encoding");
	}

}







