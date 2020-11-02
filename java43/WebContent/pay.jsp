<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String p1 = request.getParameter("p1"); //결제금액
	String p2 = request.getParameter("p2");//결제수단
	String result = "결제금액은" + p1 ;
	if(Integer.parseInt(p2)==1){//휴대폰 결제
		result = "결제금액은" + (Math.round(Integer.parseInt(p1)*0.9)) +"원";//10프로 할인
	}else if(Integer.parseInt(p2)==2){//신용카드 결제
		result = "결제금액은" + (Math.round(Integer.parseInt(p1)*0.8)) +"원";//20프로 할인
	}else if(Integer.parseInt(p2)==3){//현금 결제
		result = "결제금액은" + (Math.round(Integer.parseInt(p1)*0.7)) +"원";//30프로 할인
	}
%><%=result %>