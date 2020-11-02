<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>장바구니에 넣기</h3>
	<form action="add2.jsp"> <!--form으로 add.jsp에 데이터 넘기기  -->
		<select name="product">
			<option value="watch">시계</option>
			<option value="ballPen">볼펜</option>
			<option value="noteBook">노트북</option>
		</select><br> <select name="price">
			<option value="10000">10000원</option>
			<option value="20000">20000원</option>
			<option value="30000">30000원</option>
		</select><br>
		<button type="submit">장바구니에 넣기</button>
	</form>
</body>
</html>