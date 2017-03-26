<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>个人收藏</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
.searchBar {
	float: right;
	width: 300px;
	height: 30px;
	padding: 10px;
}

.item {
	float: left;
}

.item_space {
	margin-left: 35px;
}

.info {
	width: 155px;
	height: 18px;
	border: #999 solid 2px;
}

.info_btn {
	border: #CCC 1px solid;
	padding: 5px;
}

.location {
	clear: left;
	width: 994px;
	margin-top: 30px;
	padding-left: 30px;
	float: left;
	border-bottom: 1px solid #ccc;
}

.content_tag {
	clear: left;
	width: 1024px;
	margin-top: 10px;
	padding: 10px;
}

.the_label {
	padding: 5px;
	width: 130px;
	text-align: center;
	color: #FFF;
	font-family: "幼圆";
	font-size: 18px;
	background-color: #661470;
}

.content_info {
	float: left;
	border: 1px solid #661470;
}

.content_item {
	width: 130px;
	height: 150px;
	margin-top: 5px;
	margin-left: 25px;
	float: left;
	text-align: center;
}

.content_btn {
	float: right;
	width: 35px;
	height: 35px;
}

.content_btn:hover {
	width: 36px;
	height: 36px;
}

a {
	text-decoration: none;
}

.mainmenu {
	display: block;
	height: 30px;
	line-height: 30px;
	text-align: center;
	margin-top: 1px;
}

.tag_ul {
	list-style-type: none;
	width: 150px;
	margin-left: 2px;
	padding:0px;
	margin-top:-10px;
}


.submenu {
	display: none;
}
.submenu a{
	display:block;
	text-align: center;
	line-height:30px;
	height:30px;
	margin-top: 1px;
	border: #eee 1px solid;
}
</style>
</head>

<body>
	<div class="searchBar">
		<input type="checkbox" class="item input" /><span class="item">全选</span>
		<a href="#" class="line a item item_space">删除</a>
		<ul class="tag_ul item item_space">
			<li><a href="#" class="mainmenu">Menu One</a></li>
			<li class="submenu">
				<a href="#">Link 1</a>
				<a href="#">Link 2</a>
				<a href="#">Link 3</a>
				<a href="#">Link 4</a>
				<a href="javascript:addTag()" >添加</a>
			</li>
		</ul>
	</div>
	<div class="location">
		<span>您的位置：</span> <a href="#" class="line a">商城首页></a> <a href="#"
			class="line a">我的收藏夹</a>
	</div>
	<div class="content_tag">
		<div class="the_label">全部收藏</div>
		<div class="content_info">
			<div class="content_item">
				<img
					style="width:100px;height:110px;margin-top:5px;margin-bottom:5px;"
					src="/shop/imgs/p.PNG" /> <br /> <font color="#FF0000">888￥</font>
			</div>
			<div class="content_item">
				<img
					style="width:100px;height:110px;margin-top:5px;margin-bottom:5px;"
					src="/shop/imgs/p.PNG" /> <br /> <font color="#FF0000">888￥</font>
			</div>
			<div class="content_item">
				<img
					style="width:100px;height:110px;margin-top:5px;margin-bottom:5px;"
					src="/shop/imgs/p.PNG" /> <br /> <font color="#FF0000">888￥</font>
			</div>
			<div class="content_item">
				<img
					style="width:100px;height:110px;margin-top:5px;margin-bottom:5px;"
					src="/shop/imgs/p.PNG" /> <br /> <font color="#FF0000">888￥</font>
			</div>
			<div class="content_item">
				<img
					style="width:100px;height:110px;margin-top:5px;margin-bottom:5px;"
					src="/shop/imgs/p.PNG" /> <br /> <font color="#FF0000">888￥</font>
			</div>
			<div class="content_item">
				<img
					style="width:100px;height:110px;margin-top:5px;margin-bottom:5px;"
					src="/shop/imgs/p.PNG" /> <br /> <font color="#FF0000">888￥</font>
			</div>
			<div class="content_item">
				<img
					style="width:100px;height:110px;margin-top:5px;margin-bottom:5px;"
					src="/shop/imgs/p.PNG" /> <br /> <font color="#FF0000">888￥</font>
			</div>
			<div class="content_item">
				<img
					style="width:100px;height:110px;margin-top:5px;margin-bottom:5px;"
					src="/shop/imgs/p.PNG" /> <br /> <font color="#FF0000">888￥</font>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="/shop/js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$('.mainmenu').mouseenter(function() {
				$('.submenu').stop(false, true).hide();

				var submenu = $(this).parent().next();
				submenu.css({
					position : 'absolute',
					//top:$(this).offset().top+$(this).height()+'px',
					//left:$(this).offset().left+'px',
					width : '150px',
					zIndex : 1000
				});
				submenu.stop().slideDown(300);
				submenu.mouseleave(function() {
					$(this).slideUp(300);
				});
			});
			
		});
	
		function addTag() {
			alert(10);
		}
	</script>
</body>
</html>
