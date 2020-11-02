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
			$('#d1').empty()
			$.ajax({
				//홈페이지 https://rss2json.com/
				//api call
				url : "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fhealth.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=3mvipi6go1csfxskm7mcozy2rtepxnicadmfomj5",
				data:{
					//xml
					url : 'http://health.chosun.com/site/data/rss/rss.xml',
					//api key
					api_key : '3mvipi6go1csfxskm7mcozy2rtepxnicadmfomj5',
					//가져올 기사 갯수
					count : 20
				},
				success : function(result) {
					console.log('성공' + result)
					list = result.items
					console.log(list.length)
					if(list.length>0){
						$(list).each(function(index,news) {
							title = news.title
							pubDate = news.pubDate
							link = news.link
							 total = "<b><a href=" + link + ">"  + title + "</a></b> : " + pubDate + "<br>" +
	                           link
							$('#d1').append(total + "<hr>")
							
						})
					}
				}
			})
		})//click
	})//fun
	$(function() {
		$('#b2').click(function() {
			$('#d1').empty()
			$.ajax({
				url : "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fhealth.chosun.com%2Frss%2Fcolumn.xml&api_key=3mvipi6go1csfxskm7mcozy2rtepxnicadmfomj5",
				data :{
					url : "http://health.chosun.com/rss/column.xml",
					api_key : '3mvipi6go1csfxskm7mcozy2rtepxnicadmfomj5',
					count : 20
				},
				success : function(result) {
					console.log('성공' + result)
					list = result.items
					console.log(list.length)
					if(list.length>0){
						$(list).each(function(index,news) {
							title = news.title
							pubDate = news.pubDate
							link = news.link
							 total = "<b><a href=" + link + ">"  + title + "</a></b> : " + pubDate + "<br>" +
	                           link
							$('#d1').append(total + "<hr>")
							
						})
					}
				}
			})
		})
	})
	$(function() {
		$('#b3').click(function() {
			$('#d1').empty()
			$.ajax({
				url : "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fart.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=3mvipi6go1csfxskm7mcozy2rtepxnicadmfomj5",
				data :{
					url : "http://art.chosun.com/site/data/rss/rss.xml",
					api_key : '3mvipi6go1csfxskm7mcozy2rtepxnicadmfomj5',
					count : 20
				},
				success : function(result) {
					console.log('성공' + result)
					list = result.items
					console.log(list.length)
					if(list.length>0){
						$(list).each(function(index,news) {
							title = news.title
							pubDate = news.pubDate
							link = news.link
							 total = "<b><a href=" + link + ">"  + title + "</a></b> : " + pubDate + "<br>" +
	                           link
							$('#d1').append(total + "<hr>")
							
						})
					}
				}
			})
		})
	})
	$(function() {
		$('#b4').click(function() {
			$('#d1').empty()
			$.ajax({
				//api url 주소
				url : " https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Ftravel.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=3mvipi6go1csfxskm7mcozy2rtepxnicadmfomj5",
				data :{
					//xml 주소
					url : "http://travel.chosun.com/site/data/rss/rss.xml",
					//api_key
					api_key : '3mvipi6go1csfxskm7mcozy2rtepxnicadmfomj5',
					//가져올 갯수
					count : 20
				},
				success : function(result) {
					console.log('성공' + result)
					list = result.items // result의 아이템 가져오기
					console.log(list.length)
					if(list.length>0){ // 데이터가 존재하면
						$(list).each(function(index,news) {
							title = news.title // 제목
							pubDate = news.pubDate // 발행일자
							link = news.link//링크
							thumbnail = news.thumbnail//사진
							 total = "<b><a href=" + link + ">"  + title + "</a></b> : " + pubDate + "<br>" +
	                           link +"<br>" +"<img src= " + thumbnail +">"//사진은 태그로 감싸기
							$('#d1').append(total + "<hr>")//append로 표시
							
						})
					}
				}
			})
		})
	})
	$(function() {
		$('#b5').click(function() {
			$('#d1').empty()
			$.ajax({
				url : " https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Frss.hankyung.com%2Fnew%2Fnews_enter.xml&api_key=3mvipi6go1csfxskm7mcozy2rtepxnicadmfomj5",
				data :{
					url : "http://rss.hankyung.com/new/news_enter.xml",
					api_key : '3mvipi6go1csfxskm7mcozy2rtepxnicadmfomj5',
					count : 20
				},
				success : function(result) {
					console.log('성공' + result)
					list = result.items
					console.log(list.length)
					if(list.length>0){
						$(list).each(function(index,news) {
							title = news.title
							pubDate = news.pubDate
							link = news.link
							 total = "<b><a href=" + link + ">"  + title + "</a></b> : " + pubDate + "<br>" +
	                           link
							$('#d1').append(total + "<hr>")
							$.ajax({
								url : "db2.jsp", //db 연결 jsp 호출
								data : {
									title : title, //제목
									pubDate : pubDate,//발행일자
									link : link//링크
								},
								success : function(result) {
									console.log("성공 : " + result)
								}
							})
							
						})
					}
				}
			})
		})
	})
	
	
</script>
</head>
<body>
	 조선RSS
	<button id="b1">헬스 연결</button>
	<button id="b2">건강칼럼 연결</button>
	<button id="b3">아트 연결</button>
	<button id="b4">트레블조선 연결</button><br>
	<hr color="blue">
	한경RSS
	<button id="b5">연예 연결</button>
	<hr color="red">
	<div id="d1"></div>
</body>
</html>