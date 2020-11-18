<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
나는 수정하는 페이지입니다.<br>
게시믈 no : ${bbsVO2.no}<br>
게시믈 title : ${bbsVO2.title}<br>
게시믈 content : ${bbsVO2.content}<br>
게시믈 writer : ${bbsVO2.writer}<br>
<a href = "index.jsp">첫페이지로</a>
<a href = "delete.do">삭제페이지로</a>
</body>
</html>