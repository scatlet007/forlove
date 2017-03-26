<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title></title>
<style type="text/css">
.top{
	width:100%;
	/*background: -webkit-linear-gradient(top, #84FFFF, #33f);*/
	height:80px;
	background-image:url(/shop/imgs/top.PNG);
}
.top_title{
	font-size:30px;
	color:#FFF;
	font-family:"Arial Black", Gadget, sans-serif;
	font-weight:900;
	padding-top:15px;
	padding-left:150px;
}
.person_info{
	float:right;
	padding-right:30px;
}
.person_info_item{
	float:left;
	margin-left:13px;
	color:#FFF;
}
a{
	text-decoration:none;	
}
</style>
</head>

<body>
	<div class="top">
		<div class="top_title">阿卡琳手机商城系统</div>
		<div class="person_info">
			<a href="#" class="person_info_item">[${theAdmin.adminname }]</a> <a href="admin_logout?adminid=${theAdmin.adminid }"
				class="person_info_item">[退出]</a> <span class="person_info_item" id="timeshow">2017年02月16日
				11:20</span>
		</div>
	</div>
		<script type="text/javascript"
		src="<%=basePath%>/js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript">
		function thisTime()
		{
			var myDate=new Date();
			var year=myDate.getFullYear();
			var month=myDate.getMonth();
			var date=myDate.getDate();
			var hour=myDate.getHours();
			var minute=myDate.getMinutes();
			var seconds=myDate.getSeconds();
			$("#timeshow").text(year+"-"+month+"-"+date+" "+hour+":"+minute+":"+seconds);
		}
		window.setInterval(thisTime, 1000);
	</script>
</body>
</html>
