package com.bit.action;

import com.bit.model.entity.EmpVo;
import com.opensymphony.xwork2.Action;

public class Step02Action implements Action {
	EmpVo bean=new EmpVo();
	
	public EmpVo getBean() {
		return bean;
	}

	public void setBean(EmpVo bean) {
		this.bean = bean;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(bean);
		return Action.SUCCESS;
	}

}
