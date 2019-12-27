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
		<caption style="font-size: xx-large;">所属班级信息</caption>
		<tr>
			<th>序号</th>
			<th>班级名称</th>
			<th>班级类型</th>
			<th>班主任</th>
			<th>阶段</th>
			<th>教师</th>
			<th>主管</th>
			<th>操作</th>
		</tr>
		<s:iterator value="classes" status="i">
		<tr>
			<th><s:property value="#i.count" /></th>
			<th><s:property value="cname" /></th>
			<th><s:property value="ctype" /></th>
			<th><s:property value="headmaster.hname" /></th>
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
			<th><s:property value="teacher.tname" /></th>
			<th><s:property value="supervisor.supname" /></th>
			<th><a href="findCR.action?cid=${cid }">查看本班学员考勤情况</a></th>
		</tr>
		</s:iterator>
	</table>
</body>
</html>