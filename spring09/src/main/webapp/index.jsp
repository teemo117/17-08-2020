<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="functions" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 style="color: red">게시판 검색입니다.</h3>
<a href = "one.do?no=1">1 click</a>
<a href = "one.do?no=2">2 click</a>
<a href = "one.do?no=3">3 click</a>
<a href = "one.do?no=4">4 click</a>
<a href = "one.do?no=5">5 click</a>
<a href = "one.do?no=6">6 click</a>
<hr color="red">
<!-- 태그 사이에 내용(contents)이 비어있음. 빈태그 -->
<sql:setDataSource
	url="jdbc:mysql://localhost:3366/shop"
	driver="com.mysql.jdbc.Driver"
	user="root"
	password="1234"
	scope="application"
	var="db"
/>
<sql:query var="list" dataSource="${db}">
	select * from reply
</sql:query>
<c:forEach items="${list.rows}" var="vo">
	no: ${vo.no}, content: ${vo.content}<br>
</c:forEach>
<c:set var="date" value="<%=new Date() %>"/><br>
	<fmt:formatDate value="${date}" type="date" dateStyle="full"/><br>
	<fmt:formatDate value="${date}" type="date" dateStyle="short"/><br>
	<fmt:formatDate value="${date}" type="time" dateStyle="full"/><br>
	<fmt:formatDate value="${date}" type="both" dateStyle="full"/><br>
	이거를 pay table에 pDate로 저장해서 결제확인페이지에서 해당정보를 read해와버리기 가능?
</body>
</html>