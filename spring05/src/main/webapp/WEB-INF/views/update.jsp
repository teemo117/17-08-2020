<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>수정 페이지</h3>
검색결과: ${bbsVO2}
<hr color="blue">
게시물 no: ${bbsVO2.no}<br>
게시물 title: ${bbsVO2.title}<br>
게시물 content: ${bbsVO2.content}<br>
게시물 writer: ${bbsVO2.writer}<br>
<hr color="green">
<a href="delete.do">삭제하기</a>
</body>
</html>