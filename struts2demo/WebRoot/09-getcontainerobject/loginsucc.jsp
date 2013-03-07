<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'loginresult.jsp' starting page</title>
    
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
  	<h1>ServletActionContext</h1>
  	<hr>
	${pageScope.attr }<br>
	${requestScope.attr }<br>
	${sessionScope.attr }<br>
	${applicationScope.attr}<br>
  	<hr>
	${pageScope.map }<br>
	${requestScope.map }<br>
	${sessionScope.map }<br>
	${applicationScope.map}<br>
  	<hr>
  	<a href="<%=basePath %>09-getcontainerobject/login.jsp">Back</a>
  </body>
</html>
