package com.bit.dept.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bit.dept.model.entity.DeptVo;

public class DeptDao {
	Connection conn;
	
	public DeptDao() throws SQLException {
		String url="jdbc:mysql://localhost:3306/xe?useUnicode=true&characterEncoding=utf8";
		String user="scott";
		String password="tiger";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<DeptVo> selectAll(){
		ArrayList<DeptVo> list=new ArrayList<DeptVo>();
		String sql="select * from dept";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
				list.add(new DeptVo(
						rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc")
						));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}












