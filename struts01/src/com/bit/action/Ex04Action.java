package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex04Action implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("���ο� ��Ű������ ex04action...");
		return Action.SUCCESS;
	}

}
