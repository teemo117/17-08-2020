<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="hi?name=hong">하이 서블릿 요청!!!!!</a>
<from action="hi" method="post">
	사람이름입력: <input type="text" name="name">
	<button type="submit">하이 서블릿 요청!!</button>
</from>
</body>
</html>