<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시물 등록 정보입니다.</h3>
<hr color="red">
게시믈 no : ${bbsVO.no}<br>
게시믈 title : ${bbsVO.title}<br>
게시믈 content : ${bbsVO.content}<br>
게시믈 writer : ${bbsVO.writer}<br>
<a href="index.jsp">첫페이지</a>
<a href = "update.do">수정하는 페이지로</a>
</body>
</html>