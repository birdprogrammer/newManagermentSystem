<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="changeC.action" method="post">
		<select name="classes.cid">
	      		<option>请选择</option>
	      
	      		<option value="1">开发班</option>
	      		<option value="2">测试班</option>
	      		
	    </select>
	    <input type="hidden" name="stuid" value="${stuid}">
		<input type="submit"  value="保存" />
	</form>
</body>
</html>