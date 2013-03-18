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
    
    <title>My JSP 'input.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="_script/jquery-1.9.1.js"></script>
<script type="text/javascript">
	function getInfo() {
		$.post("http://localhost:8080/struts2demo/15-returndata/gsonaction.action",
			{
				name: $("#name").val()
			}, function(returnData, status) {
				var html = "<table><tr><th>username</th><th>password</th></tr>";
				for ( var i = 0; i < returnData.length; i++) {
					var people = returnData[i];
					var username = people.username;
					var password = people.password;
					html = html + "<tr><td>" + username + "</td><td>" + password + "</td><tr>";
				}
			
				html = html + "</table>";
				
				$("body table:eq(0)").remove();
				$("body").append(html);
			}
		);
	}
</script>
  </head>
  
  <body>
  	<h1>Struts2 Return Special Data</h1>
  	<select id="name">
  		<option value="zhangsan">zhangsan</option>  	
  		<option value="lisi">lisi</option>  	
  	</select>
  	<input type="button" value="get JSON Information" onclick="getInfo();">
  	
  	<!-- 
  	<s:form action="">
  		<s:textfield name="username"></s:textfield>
  		<s:submit value="input"></s:submit>
  	</s:form>
  	 -->
  </body>
</html>
