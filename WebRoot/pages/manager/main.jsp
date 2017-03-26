<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>后台主页</title>
</head>

<body>
	<div style="width:1000px;height:620px; border:1px solid #ccc;">
	<span style="font-size: 100px;margin-left:120px;margin-top: 100px; font-family:'华文彩云'; display:block;">欢迎回来！</span>
	</div>
</body>
</html>
