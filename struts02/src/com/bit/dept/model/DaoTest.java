package com.bit.dept.model;

import java.sql.SQLException;

import com.bit.dept.model.entity.DeptVo;

public class DaoTest {

	public static void main(String[] args) {
		DeptDao dao=null;
		try {
			dao=new DeptDao();
			System.out.println("connection:"+dao.conn);
			System.out.println("���� ó��");
			for (DeptVo bean:dao.selectAll()) {
				System.out.println(bean);
			}
		} catch (SQLException e) {
			System.out.println("exception �߻�...");
		}
	}

}
