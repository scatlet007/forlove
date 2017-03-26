<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
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
.top_main{
	width:1334px;
	height:125px;
	margin-left:auto;
	margin-right:auto;
}
.top_logo{
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
.top_content{
	height:125px;
	width:1050px;
	float:left;
}
.top_head{
	width:1050px;
	height:30px;
	line-height:30px;
}
.head_main{
	width:1050px;
	height:63px;
	background-image:url("/shop/imgs/topbar.png");
	line-height:30px;
}
.top_bottom{
	width:1050px;
	height:30px;
	line-height:30px;
}
.head_content{
	float:right;
	line-height:30px;
}
.head_content_item{
	margin-right:15px;
}
.head_content_item a{
	text-decoration:none;
	color:#999;
}
.head_items{
	line-height:56px;
	padding-left:40px;
	padding-right:40px;
}
.head_items a{
	color:#fff;
	font-size:32px;
	font-family:"微软雅黑";
	font-weight:900;
	text-decoration:none;
}
</style>
</head>

<body>
<div class="top_main">
	<div class="top_logo">
		<span class="logo_text">阿卡琳</span>
		<span class="logo_text">akalin</span>
	</div>
	<div class="top_content">
		<div class="top_head">
			<div class="head_content">
				<%if(request.getSession().getAttribute("userid")==null) {%>
					<span class="head_content_item" id="denglu"><a href="/shop/pages/index/user/login.jsp">登录</a></span>
					<span class="head_content_item" id="zhuce"><a href="/shop/pages/index/user/register.jsp">注册</a></span>
				<%}else{ %>
					<span class="head_content_item" id="denglu"><a href="#">[<%=request.getSession().getAttribute("username")%>]</a></span>
					<span class="head_content_item" id="denglu"><a href="user_logout?userid=<%=request.getSession().getAttribute("userid")%>">[退出]</a></span>
				<%} %>
				<span class="head_content_item"><a href="#">我的购物车</a></span>
				<span class="head_content_item"><a href="#">客服在线</a></span>
				<span class="head_content_item"><a href="#">收藏夹</a></span>
			</div>
		</div>
		<div class="head_main">
			<span class="head_items"><a href="#">首页</a></span>
			<span class="head_items"><a href="#">品牌专区</a></span>
			<span class="head_items"><a href="#">4G频道</a></span>
			<span class="head_items"><a href="#">3G频道</a></span>
		</div>
		<div class="top_bottom">
			<div class="head_content">
				<input type="text" style="margin-top: 5px;"/>
				<button style="margin-right:10px;">搜索</button>
			</div>
		</div>
	</div>
</div>
</body>
</html>
