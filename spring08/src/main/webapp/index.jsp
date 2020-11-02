<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상품 등록</h3>
<form action="insert.do">
번호 : <input type="text" name = "no">
이름 : <input type="text" name = "name">
내용 : <input type="text" name = "content">
가격 : <input type="text" name = "price">
<button type="submit">완료</button>
</form>
<hr color="red">

<h3>상품 수정</h3>
<form action="update.do">
번호 : <input type="text" name = "no">
가격 : <input type="text" name = "price">
<button type="submit">완료</button>
</form>

<h3>상품 삭제</h3>
<form action="delete.do">
번호 : <input type="text" name = "no">
<button type="submit">완료</button>
</form>

<h3>상품 검색</h3>
<form action="one.do">
번호 : <input type="text" name = "no">
<button type="submit">완료</button>
</form>

<a href="list.do">전체 검색</a>
</body>
</html>