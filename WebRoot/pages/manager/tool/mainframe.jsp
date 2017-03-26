<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="decotator" uri="/WEB-INF/lib/sitemesh-decorator.tld" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title><decotator:title/></title>
<style type="text/css">
.frame_content{
	margin-left: auto;
	margin-right: auto;
	width: 1200px;
}
.frame_top{
	width:1200px;
	height:80px;
	float:left;
}
.frame_left{
	height:600px;
	width:200px;
	margin-top:10px;
	padding-top:5px;
	float:left;
}
.frame_main{
	width:1000px;
	float:left;
}
</style>
<decotator:head/>
</head>

<body>
<div class="frame_content">
	<div class="frame_top">
		<jsp:include page="/pages/manager/tool/top.jsp"></jsp:include>
	</div>
	<div class="frame_left">
		<jsp:include page="/pages/manager/tool/left.jsp"></jsp:include>
	</div>
	<div class="frame_main">
		<decotator:body/>
	</div>
</div>
</body>
</html>
