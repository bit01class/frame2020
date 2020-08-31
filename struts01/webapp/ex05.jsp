<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>ex05 page</h2>
	<p>id:<%=request.getAttribute("id") %></p>
	<p>num:<%=request.getAttribute("num") %></p>
</body>
</html>