<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>삭제 페이지</h3>

<!-- webapp아래로 자동으로 페이지 넘김 -->
<%-- <% response.sendRedirect("index.jsp");%> --%>

<!-- views아래의 파일로 자동으로 페이지 넘김 -->
<jsp:forward page="home.jsp"></jsp:forward>
</body>
</html>