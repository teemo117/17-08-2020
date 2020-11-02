<%@page import="bean.BbsDTO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--1. id값 받아오기  -->
<!--2. dao와 연동하여 결과 받아와야 함  -->
<!--3. html로 만들어서 전송해야함  -->
<%
	String no = request.getParameter("no");
	int no1 = Integer.parseInt(no);
	BbsDAO dao = new BbsDAO();
	BbsDTO dto = dao.one(no1);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=dto.getNo()%>회원정보 수정 페이지입니다.
	</h3>
	<hr color="red">
	<form action="update4.jsp">

		<table border="1">
			<tr align="center">
				<td width="100" bgcolor="white">번호</td>
				<td width="200" bgcolor="pink"><%=dto.getNo()%><input
					type="hidden" name="id" value="<%=dto.getNo()%>"></td>
			</tr>
			<tr align="center">
				<td width="100" bgcolor="white">제목</td>
				<td width="200" bgcolor="pink"><input type="text" name="pw"
					value="<%=dto.getTitle()%>"></td>
			</tr>
			<tr align="center">
				<td width="100" bgcolor="white">내용</td>
				<td width="200" bgcolor="pink"><input type="text" name="name"
					value="<%=dto.getContent()%>"></td>
			</tr>
			<tr align="center">
				<td width="100" bgcolor="white">작성자</td>
				<td width="200" bgcolor="pink"><input type="text" name="tel"
					value="<%=dto.getWriter()%>"></td>
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
	<a href="update4.jsp?no=<%=dto.getNo()%>">
		<button style="background: skyblue">수정</button>
	</a>
	<a href="delete4.jsp?no=<%=dto.getNo()%>">
		<button style="background: yellow">탈퇴</button>
	</a>

</body>
</html>