<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css"/>
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script><!-- 제이쿼리선언 -->
<script type="text/javascript">

$(function() { //dom tree가 모두 로딩되면 실행 !!
	alert("환영합니다.")
	$('#b1').click(function() {
		replyValue = $('#reply').val()
		$.ajax({
			url : "reply.do",
			data : {
				reply : replyValue
			},
			success : function(result) {
				$("#d1").append(result)
			}
			
		})
	})
	
	//버튼 클릭시!
	$('#b2').click(function() {
		idValue = $('#id1').val() //id1 텍스트 가져오기
		$.ajax({
			url : "checkID.do", //url로
			data :{
				id : idValue // data 넘기기
			},
			success : function(result) {
				$("#d2").empty();//데이터 지우기
				$("#d2").append(result)//데이터채워넣기
			}
		})
	})
	
})
</script>
</head>
<body>
<form action="movielike.do"> <!--제목,관람료를 컨트롤러에 movielike.do로 넘겨주기 -->
	영화제목 : <input type="text" name="title"><br>
	영화관람료 : <input type="text" name="price"><br>
	<button type="submit">완료</button>
</form>

<hr color="red">
댓글 : <input type="text" id = "reply">
<button id="b1">댓글달기</button>
<hr color="blue">
<div id="d1"></div>

가입할 id 입력 : <input type="text" id = "id1">
<button id="b2">완료</button>
<div id="d2"></div>


</body>
</html>