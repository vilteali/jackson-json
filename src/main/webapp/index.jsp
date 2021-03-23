<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Spring REST demo</h2>
	<hr>
	<a href="${pageContext.request.contextPath}/hello">Hello</a>
	<br><br>
	<a href="${pageContext.request.contextPath}/students">Get all students</a>
	
</body>
</html>