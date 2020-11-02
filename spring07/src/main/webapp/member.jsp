<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입입니다.</h3>
<form action="create2.do">
아이디 : <input type="text" name = "id"><br>
패스워드 : <input type="text" name = "pw"><br>
이름 : <input type="text" name = "name"><br> 
전화번호 : <input type="text" name = "tel"><br>
<button type="submit">완료</button><br>
<hr color="red">
</form>

<h3>검색하기</h3>
<form action="one2.do">
아이디 : <input type="text" name = "id"><br>
<button type="submit">완료</button>
</form>

<hr color="red">

<h3>수정하기</h3>
<form action="update2.do">
아이디 : <input type="text" name = "id"><br>
전화번호 : <input type="text" name = "tel"><br>
<button type="submit">완료</button>
</form>

<hr color="red">
<h3>삭제하기</h3>
<form action="delete2.do">
아이디 : <input type="text" name = "id"><br>
<button type="submit">완료</button>
</form>
<hr>
<a href="list2.do">전체검색하기</a>
</body>
</html>