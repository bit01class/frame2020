<%@page import="com.bit.dept.model.entity.DeptVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>리스트 페이지</h2>
	<table>
		<tr>
			<th>deptno</th>
			<th>dname</th>
			<th>loc</th>
		</tr>
		<%
			java.util.ArrayList<DeptVo> list=null;
			list=(java.util.ArrayList<DeptVo>)request.getAttribute("alist");
			
			for(DeptVo bean:list){
		%>
		<tr>
			<td><%=bean.getDeptno() %></td>
			<td><%=bean.getDname() %></td>
			<td><%=bean.getLoc() %></td>
		</tr>
		<%} %>
	</table>
	<a href="add.action">[입 력]</a>
</body>
</html>






