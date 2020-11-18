<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function(){
			no = $('#no').val()
			$.ajax({
				url : "json3.do",
				data : {
					no : no
				},
				dataType : "json",
				success : function(json) {
					console.log(json)
					no = json.no
					title = json.title
					content = json.content
					writer = json.writer
					$('#d1').empty()
					$('#d1').append(no + ", " + title + ", " + content + ", " + writer + "<br>")
				}
			})
		})
	})
</script>
</head>
<body>
	<h3>json으로 가져온 값</h3>
	<hr color="red">
	게시물 no: <input type="text" id="no">
	<button id="b1">검색</button>
	<div id="d1"></div>
</body>
</html>