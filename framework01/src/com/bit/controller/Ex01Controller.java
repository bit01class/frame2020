package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Ex01Controller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cmsg=req.getServletContext().getInitParameter("cmsg");
		String msg1=getInitParameter("msg1");
		System.out.println("ex01Controller ... servlet param:"+msg1);
		System.out.println("ex01Controller ... context param:"+cmsg);
	}
}










