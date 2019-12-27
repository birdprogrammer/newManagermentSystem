<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="800">
		<caption>照片管理</caption>
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>密码</th>
			<th>照片</th>
			<th>角色ID</th>
			<th>编辑</th>
		</tr>
		<s:iterator value="list" status="i">
		<tr>
			<th><s:property value="#i.count" /></th>
			<th><s:property value="uname" /></th>
			<th><s:property value="upwd" /></th>
			<th><img width="100" alt="" src="upload/<s:property value="uphoto" />"></th>
			<th><s:property value="uid" /></th>
		</tr>
		</s:iterator>
	</table>
	<a href="uphotoAdd.jsp">添加照片</a>
</body>
</html>