<%@page import="bean.BbsDTO"%>
<%@page import="java.util.List"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--  DAO를 이용해서 결과를 ArrayList로 받아온후 html을 만든다-->
<%
	String content = request.getParameter("content");
	BbsDAO dao = new BbsDAO();
	List<BbsDTO> list = dao.all2(content);

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
	background: yellow;
}
</style>
</head>
<body>
	<h3 style="color: blue">
		검색결과의 개수는
		<%=list.size()%>개
	</h3>
	<table border="1">
		<tr>
			<td class="td">번호</td>
			<td class="td">제목</td>
			<td class="td">내용</td>
			<td class="td">작성자</td>
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
		<%-- 검색된 id <%=vo.getId() %><br>
검색된 pw <%=vo.getPw() %><br>
검색된 name <%=vo.getName() %><br>
검색된 tel <%=vo.getTel() %><br><br> --%>

		<%--검색된 id <%=list.get(i).getId() %><br>
검색된 pw <%=list.get(i).getPw() %><br>
검색된 name <%=list.get(i).getName() %><br>
검색된 tel <%=list.get(i).getTel() %><br><br> --%>
		<%
			}
		%>
	</table>
</body>
</html>