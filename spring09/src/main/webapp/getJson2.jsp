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
		$.ajax({
			url : "json.jsp",
			dataType : "json",
			success : function(result) {
				console.log(result)
				for (var i = 0; i < result.length; i++) {
					id = result[i].id
					pw = result[i].pw
					name = result[i].name
					tel = result[i].tel
					$('#d1').append(id + ", " + pw + ", " + name + ", " + tel + "<br>")
				}
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