<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상세페이지</h2>
	<div><span>deptno</span><span>${bean.deptno }</span></div>
	<div><span>dname</span><span>${bean.dname }</span></div>
	<div><span>loc</span><span>${bean.loc }</span></div>
	<div>
		<a href="edit.action?deptno=${bean.deptno }">수 정</a>
		<a href="delete.action?deptno=${bean.deptno }">삭 제</a>
	</div>
</body>
</html>