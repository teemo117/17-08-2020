<%@page import="bean.MemberDAO3"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--데이터를 vo에 담기위한 jsp생성-->
<jsp:useBean id="vo3" class="bean.MemberVO3"></jsp:useBean> 
<jsp:setProperty property="*" name="vo3"/>

<%
   MemberDAO3 dao3 = new MemberDAO3();
boolean result = dao3.create(vo3);
%><%= result %>