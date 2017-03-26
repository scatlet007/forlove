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
.foot_main{
	width:1334px;
	height:155px;
	margin-left:auto;
	margin-right:auto;
}
.foot_top{
	background-color:#ddd;
	height:30px;
	width:1334px;
}
.foot_bottom{
	height:125px;
}
.foot_top_content{
	margin-left: 280px;
	line-height:30px;
}
.foot_top_item{
	padding-left:35px;
	padding-right:35px;
	border-right:#bbb 1px solid;
}
.foot_logo{
	width:280px;
	height:100px;
	padding-top:25px;
	float:left;
}
.logo_text{
	display:block;
	font-size:38px;
	font-family:"华文彩云";
	text-align:center;
}
.foot_content{
	height:125px;
	float:left;
	margin-left:30px;
	padding-top:20px;
}
.foot_content_text{
	line-height:150%;
	color:#555;
	display:block;
	font-size:18px;
}
</style>
</head>

<body>
<div class="foot_main">
	<div class="foot_top">
		<div class="foot_top_content">
			<span class="foot_top_item">关于阿卡琳</span>
			<span class="foot_top_item">联系我们</span>
			<span class="foot_top_item">知识产权</span>
			<span class="foot_top_item">廉政举报</span>
			<span class="foot_top_item">帮助中心</span>
		</div>
	</div>
	<div class="foot_bottom">
		<div class="foot_logo">
			<span class="logo_text">阿卡琳</span>
			<span class="logo_text">akalin</span>
		</div>
		<div class="foot_content">
			<span class="foot_content_text">Copyright© 2016-2017, 阿卡琳科技有限责任公司版权所有</span>
			<span class="foot_content_text">邮箱：2736620075@qq.com 18260982021@163.com</span>
			<span class="foot_content_text">本网站直接或间接向消费者推销商品或者服务的商业宣传均属于 “广告”</span>
		</div>
	</div>
</div>
</body>
</html>
