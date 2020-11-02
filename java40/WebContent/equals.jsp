<%@page import="bean.classDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id2");
 	classDAO dao = new classDAO();
 	boolean result = dao.read(id);
	String check = "중복";
	if(result){
		check = "사용가능";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%= check%></h3>

</body>
</html>