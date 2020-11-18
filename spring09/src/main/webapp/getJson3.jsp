<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$.ajax({
		url: "json.do",
		dataType: "json",
		success: function(result) {
			console.log(result)
			id = result.no
			pw = result.title
			name = result.content
			tel = result.writer
			$('#d1').append(id+", "+pw+", "+name+", "+tel+"<br>")
		}
	})
})
</script>
</head>
<body>
<h3>json으로 가져온 값</h3>
<hr color="red">
<div id="d1"></div>
</body>
</html>