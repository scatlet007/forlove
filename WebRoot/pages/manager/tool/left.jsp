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
a {
	text-decoration: none;
}

.left_nav {
	height: 600px;
	width: 200px;
	padding-top: 5px;
	background-color: #0CF;
}

.main_nav {
	width: 190px;
	height: 590px;
	margin-top: 5px;
	margin-left: auto;
	margin-right: auto;
	background-color: #FFF;
}

.nav_title {
	height: 30px;
	width: 190px;
	background-color: #06F;
	text-align: center;
	color: #FFF;
	line-height: 30px;
	font-weight: 500;
	margin-bottom: 15px;
}

.nav_item {
	color: #FFF;
	width: 125px;
	height: 30px;
	padding-left: 45px;
	margin-left: 10px;
	margin-top: 5px;
	line-height: 30px;
	background-image: url(/shop/imgs/nav_title.PNG);
}

.nav_content {
	border: #06f 1px solid;
	color: #FFF;
	width: 168px;
	margin-left: 10px;
	background-color: #ddd;
}

li {
	list-style-image: url(/shop/imgs/text_x_copying_16px.png);
	line-height: 150%;
}

li a {
	color: #666;
}

a:hover {
	color: #0F0;
	font-size: 16px;
}

.bgimg {
	icon: url(/shop/imgs/text_x_copying.png);
}
</style>
</head>

<body>
	<div class="left_nav">
		<div class="main_nav">
			<div class="nav_title">手机管理</div>
			<div class="nav_item"
				onclick="changeDiv(document.getElementById('one'))">业务中心</div>
			<div class="nav_content" id="one">
				<ul>
					<li><a href="brand_pageQuery.action">分类管理</a></li>
					<li><a href="goods_listPhone.action">信息查询</a></li>
					<li><a href="#">销量展示</a></li>
					<li><a href="goods_toAddPhone.action">添加手机信息</a></li>
				</ul>
			</div>
			<div class="nav_item"
				onclick="changeDiv(document.getElementById('two'))">订单管理</div>
			<div class="nav_content" id="two">
				<ul>
					<li><a href="#">最近订单</a></li>
					<li><a href="#">已完成订单</a></li>
				</ul>
			</div>
			<div class="nav_item"
				onclick="changeDiv(document.getElementById('three'))">订货管理</div>
			<div class="nav_content" id="three">
				<ul>
					<li><a href="#">所有订货信息</a></li>
					<li><a href="#">添加订货信息</a></li>
				</ul>
			</div>
		</div>
	</div>

	<script type="text/javascript">
function changeDiv(div)
{
	div.style.display=(div.style.display=='none'?'block':'none');
}
</script>
</body>
</html>
