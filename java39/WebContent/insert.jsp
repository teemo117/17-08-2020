<%@page import="bean.classDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	classDAO dao = new classDAO();
	dao.create(id, pw, name, tel);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원정보확인</h3>
<hr>
<hr>
아이디 : <%=id %><br>
비밀번호 : <%=id %><br>
이름 : <%=name %><br>
전화번호 : <%=tel %><br>
<hr>
<a href="member.html">회원가입 페이지로</a>
</body>
</html>