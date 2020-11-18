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
			$.ajax({
				url : "json4.do",
				dataType : "json",
				success : function(json) {
					console.log(json)
					$('#d1').empty()
					for (var i = 0; i < json.length; i++) {
						no = json[i].no
						title = json[i].title
						content = json[i].content
						writer = json[i].writer
						$('#d1').append(no + ", " + title + ", " + content + ", " + writer + "<br>")						
					}
				}
			})
		})
	})
</script>
</head>
<body>
	<h3>json으로 가져온 값</h3>
	<hr color="red">
	<button id="b1">전체검색</button>
	<div id="d1"></div>
</body>
</html>