<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	
	$(function() {
		$("#reply").click(function() {
			contentValue = $("#content").val()
			$.ajax({
				url : "create.do",
				data : {
					content : contentValue,
					original : '${one.no}', //one.get~~
					writer : '${id}'
				},
				success : function(result) {
					$('#table2').append(result)
					location.reload()
				}//success

			})//ajax
		})//clifk
	})//$function
</script>
</head>
<body>
	<h3>회원 등록 정보입니다.</h3>
	<hr color="red">
	<table align="center">
		<tr>
			<td style="color: blue; width: 150px; background: yellow">게시물번호</td>
			<td style="color: blue; width: 250px; background: green">${one.no}</td>
		</tr>
		<tr>
			<td style="color: blue; width: 150px; background: yellow">게시물제목</td>
			<td style="color: blue; width: 250px; background: green">${one.title}</td>
		</tr>
		<tr>
			<td style="color: blue; width: 150px; background: yellow">게시물내용</td>
			<td style="color: blue; width: 250px; background: green">${one.content}</td>
		</tr>
		<tr>
			<td style="color: blue; width: 150px; background: yellow">게시물작성자</td>
			<td style="color: blue; width: 250px; background: green">${one.writer}</td>
		</tr>

	</table>
	<hr color="green">
	댓글 : <input id="content"> <button id="reply">댓글달기</button>
	<div id="d2" style="width: 450px; height: 60px; margin: 0px auto;">
		<table id="table2" align="center" width=450 border="1">
			<c:forEach items="${list}" var="vo" varStatus="status">
				<tr>
					<td style="width: 150px">${total - status.index + 1}</td>
					<td style="width: 300px">${vo.content}</td>
					<td style="width: 350px">${vo.writer}</td>
					<td style="width: 350px">
						<!--one.do?no=1--> <a
						href="delete3.do?no=${vo.no}&$original=${vo.original}">
							<button style="background: yellow;">삭제</button>
					</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>