<%@page import="bean.classVO"%>
<%@page import="bean.classDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--1. id값 받아오기  -->
<!--2. dao와 연동하여 결과 받아와야 함  -->
<!--3. html로 만들어서 전송해야함  -->
<%
	String id = request.getParameter("id");
classDAO dao = new classDAO();
classVO vo = dao.one(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=vo.getId()%>회원정보 검색 내용입니다.
	</h3>
	<hr color="red">
	<table border="1">
		<tr align="center">
			<td width="100" bgcolor="white">아이디</td>
			<td width="200" bgcolor="pink"><%=vo.getId()%></td>
		</tr>
		<tr align="center">
			<td width="100" bgcolor="white">패스워드</td>
			<td width="200" bgcolor="pink"><%=vo.getPw()%></td>
		</tr>
		<tr align="center">
			<td width="100" bgcolor="white">이름</td>
			<td width="200" bgcolor="pink"><%=vo.getName()%></td>
		</tr>
		<tr align="center">
			<td width="100" bgcolor="white">전화번호</td>
			<td width="200" bgcolor="pink"><%=vo.getTel()%></td>
		</tr>
	</table>
	<hr color="gren">
	<a href="index.html">
		<button style="background: green">처음페이지로</button>
	</a>
	<a href="update.jsp?id=<%=vo.getId()%>">
		<button style="background: skyblue">수정</button>
	</a>
	<a href="delete.jsp?id=<%=vo.getId()%>">
		<button style="background: yellow">탈퇴</button>
	</a>
	
</body>
</html>