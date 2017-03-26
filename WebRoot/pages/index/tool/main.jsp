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
<decotator:head/>
<style type="text/css">
.frame_main{
	margin-left:auto;
	margin-right:auto;
	width:1334px;
}
.frame_top{
	width:1334px;
	height:125px;
	float:left;
	border:1px solid #ccc;
}
.frame_left{
	width:280px;
	float:left;
	border:1px solid #eee;
}
.frame_foot{
	width:1334px;
	float:left;
}
.frame_content{
	width:1050px;
	float:left;
}
.top_img{
	width:1050px;
	border:1px solid #ccc;
}
</style>
</head>
<body>
<div class="frame_main">
	<div class="frame_top">
		<jsp:include page="/pages/index/tool/top.jsp"></jsp:include>
	</div>
	<div class="frame_left">
		<jsp:include page="/pages/index/tool/left.jsp"></jsp:include>
	</div>
	<div class="frame_content">
		<img alt="" class="top_img" src="/shop/imgs/head_img.png">
		<div class="frame_content_main">
			<decotator:body/>
		</div>
	</div>
	<div class="frame_foot">
		<jsp:include page="/pages/index/tool/foot.jsp"></jsp:include>
	</div>
</div>
</body>
</html>
