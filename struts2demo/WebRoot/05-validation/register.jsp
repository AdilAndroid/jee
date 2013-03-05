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
    
    <title>My JSP 'register.jsp' starting page</title>
    
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
  	<s:form action="05-validation/validationFrameworkRegister.action" >
  		<h1>用户注册</h1><hr>
  		<!--<s:actionerror />
  		 <s:fielderror cssStyle="clear:both; color: #F33;"></s:fielderror> -->
  		<s:textfield name="username" size="20" label="username" />
  		<s:password name="password" size="20" label="password" />
  		<s:password name="repassword" size="20" label="repassword" />
  		<s:textfield name="age" size="20" label="age" />
  		<s:textfield name="birthday" size="20" label="birthday" />
  		<s:textfield name="graduation" size="20" label="graduation" />
  		<s:submit value="submit"></s:submit>
  	</s:form>
  </body>
</html>
