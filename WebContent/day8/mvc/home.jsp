<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
Home
<a href="./controller?cmd=viewRegist">등록</a>
<a href="./controller?cmd=searchAll">전체조회</a>
<form action="./controller?cmd=search" method="post">
	<input type="text" name="id">
	<input type="submit" value="부분조회">
</form>
</body>
</html>