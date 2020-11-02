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
	<h3><%=vo.getId()%>회원정보 수정 페이지입니다.
	</h3>
	<hr color="red">
	<form action="update2.jsp">

		<table border="1">
			<tr align="center">
				<td width="100" bgcolor="white">아이디</td>
				<td width="200" bgcolor="pink"><%=vo.getId()%><input
					type="hidden" name="id" value="<%=vo.getId()%>"></td>
			</tr>
			<tr align="center">
				<td width="100" bgcolor="white">패스워드</td>
				<td width="200" bgcolor="pink"><input type="text" name="pw"
					value="<%=vo.getPw()%>"></td>
			</tr>
			<tr align="center">
				<td width="100" bgcolor="white">이름</td>
				<td width="200" bgcolor="pink"><input type="text" name="name"
					value="<%=vo.getName()%>"></td>
			</tr>
			<tr align="center">
				<td width="100" bgcolor="white">전화번호</td>
				<td width="200" bgcolor="pink"><input type="text" name="tel"
					value="<%=vo.getTel()%>"></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit">수정 처리 요청</button>
				</td>
			</tr>
		</table>
	</form>
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