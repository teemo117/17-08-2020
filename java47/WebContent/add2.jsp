<%@page import="java47.BasketVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<jsp:useBean id="vo" class="java47.BasketVO"></jsp:useBean> <!--액션테그로 데이터 받아오기-->
<jsp:setProperty property="*" name="vo"/>
<%
   /* String product = request.getParameter("product"); // product 데이터 가져오기
   String price = request.getParameter("price");
   BasketVO vo = new BasketVO(); // 액션태그 이전에 객체로 해보기
   //받은데이터들 vo에 저장
   vo.setProduct(product);
   vo.setPrice(price); */
   ArrayList<BasketVO> list = null; //리스트에 담을 변수생성
   if(vo.getProduct() != null){//product 데이터가 null이 아니면
      if (session.getAttribute("basket") != null) {
         //null이 아니라는 의미는 이미 장바구니가 만들어져있다는 얘기
         //기존에 있던 세션으로 잡아둔 장바구니 목록을 가지고 와서
         //거기에다가 새로운 장바구니 물건을 추가한다.
         list = (ArrayList<BasketVO>)session.getAttribute("basket"); //장바구니 세션 저장하기
         list.add(vo);//장바구니페이지에서 받아온 데이터 넣기(아이템,가격)
      } else {
         //null이라는 의미는 장바구니 목록이 안만들어져있다는 얘기
         list = new ArrayList<>(); // 리스트생성
         list.add(vo);//데이터 넣기
      }
      session.setAttribute("basket", list); //생성한 리스트로 장바구니 세션 만들기
   }else{
	   //null 값이 들어갈수도있으니
      list = (ArrayList<BasketVO>)session.getAttribute("basket");
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
      for(int i = 0 ; i < list.size(); i++){
    	 vo = list.get(i);
   %>
    	  아이템 : <%=vo.getProduct()%><br>
    	  가격 : <%=vo.getPrice() %><br>
   <%      
      }
   }
   %>
   <hr color="green">
   <a href="null.jsp">장바구니 비우기</a>
</body>
</html>