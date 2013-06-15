<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
	<form action="<%=basePath %>01_person/updateperson.action">
		Username:
		<s:textfield name="username" value="%{#request.person.username}"
			readonly="true" />
		<br> Password:
		<s:password name="password" value="%{#request.person.password}" />
		<br> Age:
		<s:textfield name="age" value="%{#request.person.age}" />
		<br> RegisterDate:
		<s:textfield name="registerDate"
			value="%{#request.person.registerDate}" />
		<br>
		<s:hidden name="id" value="%{#request.person.id}"></s:hidden>
		<s:submit value="submit"></s:submit>
	</form>

</body>
</html>
