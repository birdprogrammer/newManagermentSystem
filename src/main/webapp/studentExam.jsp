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
		<caption style="font-size: xx-large;">学生成绩</caption>
		<tr>
			<th>序号</th>
			<th>成绩</th>
			<th>考试时间</th>
			<th>阶段</th>
		</tr>
		<s:iterator value="exam" status="i">
		<tr>
			<th><s:property value="#i.count" /></th>
			<th><s:property value="score" /></th>
			<th><s:property value="erdate" /></th>
		
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
		</tr>
		</s:iterator>
	</table>
	
</body>
</html>