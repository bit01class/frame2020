package com.bit.emp.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.bit.emp.model.entity.EmpVo;
import com.opensymphony.xwork2.ModelDriven;

public class EmpAction implements ModelDriven<EmpVo> {
	EmpVo bean=new EmpVo();
	static List<EmpVo> list=new ArrayList<>();
	
	public EmpAction() {
		System.out.println("Action객체 생성...");
	}
	
	public EmpVo getBean() {
		return bean;
	}

	public void setBean(EmpVo bean) {
		this.bean = bean;
	}
	
	public List<EmpVo> getList() {
		return list;
	}
	
	public String addList() {
		list.add(bean);
		System.out.println(list);
		return "success";
	}

	public String empList() {
		System.out.println(list);
		return "success";
	}

	@Override
	public EmpVo getModel() {
		return bean;
	}
}
