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
회원 id : ${memberVO.id}<br>
-----------------------------<br>
수정된 회원 tel : ${memberVO.tel}<br>
<a href = "index.jsp">첫페이지로</a>
<a href = "delete.do">삭제페이지로</a>
</body>
</html>