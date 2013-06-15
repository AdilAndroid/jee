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
	<table width="80%" align="center" border="1">
		<tr>
			<th>username</th>
			<th>password</th>
			<th>age</th>
			<th>registerDate</th>
			<th>update</th>
			<th>delete</th>
		</tr>
		<%-- 迭代request中的personList元素，元素变量名为person --%>
		<s:iterator value="#request.personList" id="person">
			<tr>
			<%-- 每个元素都是Person对象，取Person对象的属性 --%>
				<td><s:a href="01_person/persondesc.action?id=%{#person.id}"><s:property value="username" /></s:a></td>
				<td><s:property value="password" /></td>
				<td><s:property value="age" /></td>
				<td><s:property value="registerDate" /></td>
				<td><s:a href="01_person/updatepersonjsp.action?id=%{#person.id}">update</s:a></td>
				<td><s:a href="01_person/deleteperson.action?id=%{#person.id}">delete</s:a></td>
			</tr>
		</s:iterator>
			<tr>
			<td><s:a href="01_person/personadd.jsp">add</s:a></td>
			</tr>
	</table>
</body>
</html>
