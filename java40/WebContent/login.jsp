<%@page import="bean.classDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id2");
	String pw = request.getParameter("pw2");
	classDAO dao = new classDAO();
	boolean result = dao.read(id, pw);
	String check = "로그인 실패";
	if (result) {
		check = "로그인 성공";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=check%></h3>
</body>
</html>