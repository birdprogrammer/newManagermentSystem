<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="1200" align="center">
		<caption style="font-size: xx-large;">本班学生信息</caption>
		<tr>
			
			<th>姓名</th>
			<th>性别</th>
			
			<th>阶段</th> 
			<th>操作</th>
		</tr>
		<s:iterator value="stus" status="i">
		<tr>
			
			<th><s:property value="stuname" /></th>
			<th><s:property value="sex" /></th>
		
			
			<th><s:property value="stage.sid" /></th>
			<th>		
				<a href="findCheckRecord.action?crid=${checkrecord.crid}" >查看考勤</a>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="changeClass.action?stuid=${stuid }" >转班</a>
			</th>
			
		</tr>
		</s:iterator>
	</table>

</body>
</html>