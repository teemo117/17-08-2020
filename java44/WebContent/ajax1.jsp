<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>

<script type="text/javascript">
//콜백함수(call-back함수)
//특정한 이벤트를 기다렸다가 그 이벤트가 발생하면
//함수가 정의되어있는 곳으로 돌아가 자동 호출되는 함수
//body의 하위 엘리먼트(태그)를 먼저 브라우저가 dom-tree를 구성한 후 
//함수를 정의
//브라우저가 스크립트를 먼저 실행하고 인식하는 것이 아니라 
//body 부분을 먼저 읽어서 dom-tree를 만들도록 해야함
$(function() {
	$('#b1').click(function() {
		$.ajax({ //비동기 처리 ajax(url,data,success(성공시))
			url : "data/member.xml", //url 선언
			success : function(doc) { // 성공 시 doc객체 반환
				console.log("XML요청 성공")
				console.log("XML결과 : " + doc)
				list = $(doc).find('record')//doc에 있는 record를 찾아 list에 저장
				console.log('레코드의 개수 :' + list.length)
				if(list.length > 0){//list가 0보다 크면 > 데이터가 있으면
					$(list).each(function(index,item) { //자바의 foreach문과 동일, list에 있는 데이터 추출
						id = $(item).find('id').text()//item 내에 id의 텍스트 값을 id에 저장
						first_name = $(item).find('first_name').text()
						last_name = $(item).find('last_name').text()
						email = $(item).find('email').text()
						gender = $(item).find('gender').text()
						tel = $(item).find('tel').text()//item 내에 gender의 텍스트 값을 gender에 저장
						/* console.log(index + ' first_name : '+name ) */
						$('#d1').append((index+1) + ' id : ' + id+"<br>")
						$('#d1').append((index+1) + ' first_name : ' + first_name+"<br>")
						$('#d1').append((index+1) + ' last_name : ' + last_name+"<br>")
						$('#d1').append((index+1) + ' email : ' + email+"<br>")
						$('#d1').append((index+1) + ' gender : ' + gender+"<br>")
						$('#d1').append((index+1) + ' tel : ' + tel+"<br><br>")
						$.ajax({ //db에 데이터 삽입을 위한 비동기 처리
							url : "db1.jsp", //url db1.jsp 설정
							data :{
								id : id, //DB 컬럼에 맞게 데이터들 정렬
								first_name : first_name,
								last_name : last_name,
								email : email,
								gender : gender,
								tel : tel
							},
							success : function(result) {
								console.log("db1.jsp 를 통해 db에 넣기 - 전송함")
								console.log('db1.jsp의 결과 : ' + result)
							}
						})
						
					})
					
				}
			}
		})
	})
	$('#b2').click(function() {
		$.ajax({
			url : "data/member.json",
			success : function(doc) {
				console.log(doc)
				$(doc).each(function(index,item) {
					id = item.id
					first_name = item.first_name,
					last_name =item.last_name,
					email =item.email,
					gender =item.gender,
					tel =item.tel
					
					$('#d1').append((index+1) + ' id : ' + id+"<br>")
					$('#d1').append((index+1) + ' first_name : ' + first_name+"<br>")
					$('#d1').append((index+1) + ' last_name : ' + last_name+"<br>")
					$('#d1').append((index+1) + ' email : ' + email+"<br>")
					$('#d1').append((index+1) + ' gender : ' + gender+"<br>")
					$('#d1').append((index+1) + ' tel : ' + tel+"<br><br>")
				})//each
			}//success
		})
	})//fun
	$('#b3').click(function() {
		
	})
})
</script>
</head>
<body>
<button id="b1">XML읽어오기</button>
<button id="b2">JOSN읽어오기</button>
<button id="b3">DB에넣기</button>
<hr color="red">
<div id="d1"></div>
</body>
</html>