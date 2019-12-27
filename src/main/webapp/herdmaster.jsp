<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="600" align="center">
		<caption style="font-size: xx-large;">学生信息</caption>
		<tr>
			<th>班主任姓名</th>
			
			<th>操作</th>

		</tr>
		<!-- //<s:iterator value="stus" status="i"> -->
		<tr>
			<th><s:property value="hname" /></th>
			
			<th>	
				<a href="#"  >添加学员信息</a>
				<a href="#"  >转班</a>
				<a href="#" >添加学员考勤</a>	
			</th>
	
		</tr>
	<!-- 	</s:iterator> -->
	</table>
</body>
</html>