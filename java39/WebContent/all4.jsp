<%@page import="java.util.List"%>
<%@page import="bean.BbsDTO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	BbsDAO dao = new BbsDAO();
List<BbsDTO> list = dao.all();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
td {
	width: 100px;
	text-align: center;
}

.td {
	background: skyblue;
}
</style>
</head>
<body>
	<table border="1">
		<tr>
			<td class=td>번호</td>
			<td class=td>제목</td>
			<td class=td>내용</td>
			<td class=td>작성자</td>
		</tr>
		<%
			for (int i = 0; i < list.size(); i++) {
			BbsDTO vo = list.get(i);
		%>
		<tr>
			<td><%=vo.getNo()%></td>
			<td><%=vo.getTitle()%></td>
			<td><%=vo.getContent()%></td>
			<td><%=vo.getWriter()%></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>