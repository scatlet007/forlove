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
.left_main{
width:280px;
border:1px #555 solid;
}
.phone_brand{
	width:280px;
	padding-bottom:10px;
}
.brand_item{
	width:270px;
	margin-left:auto;
	margin-right:auto;
	margin-top:10px;
	border:1px solid #ccc;
	padding-bottom: 10px;
}
.brand_item_top{
	height:30px;
	line-height:30px;
	font-family:"微软雅黑";
	font-size: 24px;
	padding-left: 20px;
	color:navy;
	font-weight: 900;
	border:2px solid #ccc;
}
.brand_img{
	margin-top:5px;
	display:block;
	float:left;
}
.brand_title{
	display:block;
	float:left;
}
.brand_item_content{
	line-height:150%;
}
.brand_item_content ul li{
	list-style-type: none;
}
.brand_text {
	text-decoration:none;
	font-size:16px;
	font-family:"微软雅黑";
	color:#666;
}
.brand_text:hover{
	font-size:18px;
	color:red;
}
.help_desk{
	width:280px;
	padding-bottom: 10px;
	margin-left:auto;
	margin-right: auto;
}
</style>
</head>

<body>
<div class="left_main">
	<div class="phone_brand">
		<img alt="" src="/shop/imgs/btn01.png" style="margin-left:5px;">
		<div class="brand_item">
			<div class="brand_item_top">
				<img alt="" class="brand_img" src="/shop/imgs/apple_iphone4_mobile_phone_.png">
				<span class="brand_title">中兴</span>
			</div>
			<div class="brand_item_content">
				<ul>
					<li><a href="#" class="brand_text">BLADE A2 Plus</a></li>
					<li><a href="#" class="brand_text">中兴天机 7MAX</a></li>
					<li><a href="#" class="brand_text">BLADE A2</a></li>
					<li><a href="#" class="brand_text">BLADE V8</a></li>
				</ul>
			</div>
		</div>
		<div class="brand_item">
			<div class="brand_item_top">
				<img alt="" class="brand_img" src="/shop/imgs/apple_iphone4_mobile_phone_.png">
				<span class="brand_title">华为</span>
			</div>
			<div class="brand_item_content">
				<ul>
					<li><a href="#" class="brand_text">HUAWEI P10</a></li>
					<li><a href="#" class="brand_text">HUAWEI Mate 9</a></li>
					<li><a href="#" class="brand_text">华为畅享 6S</a></li>
					<li><a href="#" class="brand_text">HUAWEI nova</a></li>
					<li><a href="#" class="brand_text">华为畅享 5S</a></li>
				</ul>
			</div>
		</div>
		<div class="brand_item">
			<div class="brand_item_top">
				<img alt="" class="brand_img" src="/shop/imgs/apple_iphone4_mobile_phone_.png">
				<span class="brand_title">三星</span>
			</div>
			<div class="brand_item_content">
				<ul>
					<li><a href="#" class="brand_text">Galaxy On5</a></li>
					<li><a href="#" class="brand_text">Galaxy C5 Pro</a></li>
					<li><a href="#" class="brand_text">Galaxy S6</a></li>
					<li><a href="#" class="brand_text">Galaxy A9</a></li>
					<li><a href="#" class="brand_text">Galaxy C7</a></li>
				</ul>
			</div>
		</div>
		<div class="brand_item">
			<div class="brand_item_top">
				<img alt="" class="brand_img" src="/shop/imgs/apple_iphone4_mobile_phone_.png">
				<span class="brand_title">小米</span>
			</div>
			<div class="brand_item_content">
				<ul>
					<li><a href="#" class="brand_text">红米 Note4</a></li>
					<li><a href="#" class="brand_text">红米 4A</a></li>
					<li><a href="#" class="brand_text">小米5</a></li>
					<li><a href="#" class="brand_text">小米5C</a></li>
					<li><a href="#" class="brand_text">小米MIX</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="help_desk">
		<img alt="" src="/shop/imgs/btn02.png" style="margin-left:5px;">
		<div class="brand_item_content">
			<ul>
				<li><a href="#" class="brand_text">line one:100-108</a></li>
				<li><a href="#" class="brand_text">line two:199-1098</a></li>
				<li><a href="#" class="brand_text">line three:189-098</a></li>
			</ul>
			<span style="font-size:24px;margin-left:30px;font-weight:900;">TEL:02-123-446</span>
		</div>
	</div>
</div>
</body>
</html>
