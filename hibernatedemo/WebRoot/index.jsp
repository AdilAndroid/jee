<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my hibernatedemo JSP page. <br>
    <a href="01_person/personadd.jsp">Person Add</a><br><span></span>
    <a href="02_execandwaitinterceptor/input.jsp">Excute And Wait</a><br><span></span>
    <a href="03_people/peopleinsert.jsp">People Insert</a><br><span></span>
    <a href="04_customer_order/customer.jsp">Customer Insert</a><br><span></span>
    <a href="05_category/insertcategory.action">Category Insert</a><br><span></span>
    <a href="06_studentandidcard/insertstudent.action">Student Insert</a><br><span></span>
    
    
  </body>
</html>
