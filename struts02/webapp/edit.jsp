<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>수정 페이지</h2>
	<form action="update.action" method="post">
		<div>
			<label for="deptno">deptno</label>
			<input type="text" name="deptno" id="deptno" value="${bean.deptno }" readonly/>
		</div>
		<div>
			<label for="dname">dname</label>
			<input type="text" name="dname" id="dname" value="${bean.dname }" />
		</div>
		<div>
			<label for="loc">loc</label>
			<input type="text" name="loc" id="loc" value="${bean.loc }" />
		</div>
		<div>
			<button>수 정</button>
		</div>
	</form>
</body>
</html>