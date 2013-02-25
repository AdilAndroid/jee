<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userslogin.jsp' starting page</title>
    
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
  <a href="<%=basePath%>/04-method/method1Action.action">method1 invoke</a><br>
  <a href="<%=basePath%>/04-method/method2Action.action">method2 invoke</a><br>
  
  <hr>
  
  
  <a href="<%=basePath%>/04-method/methodAction!method1.action">method1 invoke</a><br>
  <a href="<%=basePath%>/04-method/methodAction!method2.action">method2 invoke</a><br>
  </body>
</html>
