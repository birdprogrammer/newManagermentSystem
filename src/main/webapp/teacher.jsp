<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="800" align="center">
		<caption style="font-size: xx-large;">教师信息</caption>
		<tr>
			<th>序号</th>
			<th>教师姓名</th>
			<th>主管</th>
			<th>阶段</th>
			<th>编辑</th>
		</tr>
		<s:iterator value="teachers" status="i">
		<tr>
			<th><s:property value="#i.count" /></th>
			<th><s:property value="tname" /></th>
			<th><s:property value="supervisor.supid==1?'Boss':'1'" /></th>
			<s:if test="stage.sid==4">
				<th><s:property value="stage.sid==4?'第四阶段':'4'" /></th>
			</s:if>
			<s:if test="stage.sid==3">
				<th><s:property value="stage.sid==3?'第三阶段':'4'" /></th>
			</s:if>
			<s:if test="stage.sid==2">
				<th><s:property value="stage.sid==2?'第二阶段':'4'" /></th>
			</s:if>
			<s:if test="stage.sid==1">
				<th><s:property value="stage.sid==1?'第一阶段':'4'" /></th>
			</s:if>
			<th><a href="findClass.action?tid=${tid }">查看所属班级</a>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	
			</th>
		</tr>
		</s:iterator>
	</table>
</body>
</html>