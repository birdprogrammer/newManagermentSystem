<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
</head>
<%
SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
String s=df.format(new Date());
%>    
<body>
	<form class="form-horizontal" role="form" style="width:550px;margin:10px auto;" action="addExam.action" method="post">
		 		 <div class="form-group">
					    <label for="examrecord.score" class="col-sm-3 control-label">学生阶段成绩:</label>
					    <div class="col-sm-9">
					      <input type="text" class="form-control" placeholder="请输入成绩" name="examrecord.score">
					    </div>
 					   </div>
					 <div class="form-group">
					    <label for="examrecord.score" class="col-sm-3 control-label">阶段:</label>
					    <div class="col-sm-9">
					    	<select name="examrecord.stage.sid">
					    		<option value="1" >第一阶段</option>
					    		<option value="2" >第二阶段</option>
					    		<option value="3" >第三阶段</option>
					    		<option value="4" >第四阶段</option>
					    	</select>
					    </div>
 					   </div>
 		
 		<div class="form-group">
					    <label for="inputEmail3" class="col-sm-3 control-label"></label>
					    <div class="col-sm-9">
					    	 <input type="hidden" name="examrecord.erdate" value="<%=s%>" />
					       <input type="submit" class="btn btn-info col-sm-12" value="保存" />
					    </div>
 					   </div>
	</form>
	 <script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
	  <script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>