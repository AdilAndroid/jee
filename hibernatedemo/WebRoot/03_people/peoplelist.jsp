<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
	<table border="1" width="80%">
		<tr>
			<th>id</th>
			<th>username</th>
			<th>password</th>
			<th>telphone</th>
			<th>gender</th>
			<th>graduation</th>
			<th>birthday</th>
			<th>marryTime</th>
			<th>file</th>
		</tr>
		<s:iterator value="#request.peoples" id="people">
		<tr>
			<td><s:property value="id" /></td>
			<td><s:property value="username" /></td>
			<td><s:property value="password" /></td>
			<td><s:property value="telphone" /></td>
			<td><s:property value="gender" /></td>
			<td><s:property value="graduation" /></td>
			<td><s:property value="birthday" /></td>
			<td><s:property value="marryTime" /></td>
			<td><s:property value="file" /></td>
		</tr>
		</s:iterator>
	
	</table>
</body>
</html>
