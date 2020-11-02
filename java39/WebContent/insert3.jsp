<%@page import="bean.BbsDTO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="vo" class="bean.BbsDTO"></jsp:useBean>
<jsp:setProperty property="*" name="vo"/>
<%
BbsDAO dao = new BbsDAO();
boolean result = dao.create(vo);
String check = "작성 미완료";
if (result) {
	check = "작성완료";
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		작성 결과 :<%=check%></h3>
</body>
</html>