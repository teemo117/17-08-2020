<%@page import="bean.MemberDAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--데이터를 vo에 담기위한 jsp생성-->
<jsp:useBean id="vo2" class="bean.MemberVO2"></jsp:useBean> 
<jsp:setProperty property="*" name="vo2"/>

<%
   MemberDAO2 dao2 = new MemberDAO2();
   boolean result = dao2.create(vo2);
%><%= result %>