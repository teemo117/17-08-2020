<%@page import="bean.classDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- <<지시자 톰캣에게 전달하는 부분(@) -->
<!-- 
1. 클라이언트가 입력해서 제출한 데이터를 받아와야한다. - 컨트롤러(C)
2. DB연동해서 처리해서 결과받아와야한다. - 컨트롤러(C)
3. 받아온 결과에 따라서 화면을(html) 만들어서 클라이언트에게 전송
 -->
 <%
 	//스크립트트릿(scriptlet)
  	//HttpServletRequest request = new HttpServletRequest();
  	//내장된 객체
  	String id = request.getParameter("id");
  	String pw = request.getParameter("pw");
  	//자동import : 해당 클래스를 클릭하고, ctrl+shift+m
  	classDAO dao = new classDAO();
  	boolean result = dao.read(id, pw);
  	String check ="로그인 not";
  	if(result){
  		check="로그인 ok";
  	}
 %> <!-- 자바 코드 들어가는 부분 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>당신이 입력한 정보는 <%=check %> 입니다.</h3>
<hr color="red">
아이디 : <%=id %> <br><!-- 표현식 -->
패스워드 : <%=pw%><br>
<hr color:"blue">
<a href="login.html">로그인 페이지로</a>
</body>
</html>