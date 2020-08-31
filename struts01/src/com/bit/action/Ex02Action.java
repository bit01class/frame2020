package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex02Action implements Action {
	// Field descriptor #4 Ljava/lang/String;
		//public static final java.lang.String SUCCESS = "success";
		//public static final java.lang.String NONE = "none";
		//public static final java.lang.String ERROR = "error";
		//public static final java.lang.String INPUT = "input";
	 	//public static final java.lang.String LOGIN = "login";

	@Override
	public String execute() throws Exception {
		System.out.println("Ex02 Action run...");
		return Action.SUCCESS;
	}

}
