<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
   String product = request.getParameter("product"); // product 데이터 가져오기
   ArrayList<String> list = null; //리스트에 담을 변수생성
   if(product != null){//product 데이터가 null이 아니면
      if (session.getAttribute("basket") != null) {
         //null이 아니라는 의미는 이미 장바구니가 만들어져있다는 얘기
         //기존에 있던 세션으로 잡아둔 장바구니 목록을 가지고 와서
         //거기에다가 새로운 장바구니 물건을 추가한다.
         list = (ArrayList<String>)session.getAttribute("basket");
         list.add(product);
      } else {
         //null이라는 의미는 장바구니 목록이 안만들어져있다는 얘기
         list = new ArrayList<>();
         list.add(product);
      }
      session.setAttribute("basket", list);
   }else{
      list = (ArrayList<String>)session.getAttribute("basket");
   }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   if(session.getAttribute("basket") == null){
%>
      <h3>장바구니가 비어있음.</h3>
   <%
   }else{
   %>
      <h3>장바구니의 개수<%=list.size()%>개 들어있음.</h3>
   <h3>장바구니 목록</h3>
   <hr color="blue">
   <%
      for(String s: list){
   %>
      <%= s %><br>
   <%      
      }
   }
   %>
   <hr color="green">
   <a href="null.jsp">장바구니 비우기</a>
</body>
</html>