<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%
    String tel = request.getParameter("tel");
	String check1 = ""; //랜덤값생성
	String check2 = "11"; //010 > 11 | 011 > 22
	
   	for(int i =0; i < 4;i++){ // 랜덤값 4개생성해서 check1 에 저장
	   	check1 = check1 + (int)(Math.random()*10000)%10;
   	
   	//0.123123 > 1231.23 > 23(int) % 10 >> 3
   	//0.012312 >  123.12
   	}
   	if(tel.substring(0,3).equals("010")){ //앞자리가 010이라면
   		check2 = check2 + check1;
   	}else{ // 010이 아니라면
   		check2 = "22" + check1;
   	} %><%=check2%>