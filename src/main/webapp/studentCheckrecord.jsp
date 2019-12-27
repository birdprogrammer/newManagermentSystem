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
		<caption style="font-size: xx-large;">学生考勤记录</caption>
		<tr>
			<th>序号</th>
			<th>考勤时间</th>
			<th>考勤类型</th>
		</tr>
		<s:iterator value="checkRecord" status="i">
		<tr>
			<th><s:property value="#i.count" /></th>
			<th><s:property value="crdate" /></th>
			<s:if test="checktype.ctid==4">
				<th><s:property value="checktype.ctid==4?'正常':'4'" /></th>
			</s:if>
			<s:if test="checktype.ctid==3">
				<th><s:property value="checktype.ctid==3?'迟到':'4'" /></th>
			</s:if>
			<s:if test="checktype.ctid==2">
				<th><s:property value="checktype.ctid==2?'早退':'4'" /></th>
			</s:if>
			<s:if test="checktype.ctid==1">
				<th><s:property value="checktype.ctid==1?'旷课':'4'" /></th>
			</s:if>
		</tr>
		</s:iterator>
	</table>
	
</body>
</html>