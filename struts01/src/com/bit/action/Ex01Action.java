package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex01Action implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("½ºÆ®·µÃ÷·Î È­¸éÀ» »Ñ¸®°Ú½À´Ï´Ù.");
		return "success";
	}

}
