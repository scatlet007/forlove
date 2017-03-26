<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>列表</title>
<style type="text/css">
.main {
	width: 1000px;
	margin-left: 20px;
	float:left;
}

.info_title {
	width: 1000px;
	height: 50px;
	line-height: 50px;
	font-family: "华文彩云";
	font-size: 32px;
	padding-left : 20px;
	background-color: #eee;
	margin-top:10px;
	padding-left: 20px;
	float:left;
}

.info_content {
	font-size: 14px;
	float:left;
	border:1px solid #eee;
}

.item {
	border: #DDD 1px solid;
	width: 225px;
	height: 305px;
	float: left;
	margin: 5px;
}

.item:hover {
	border: #0F0 1px solid;
}

.item_top {
	border-bottom: #DDD 1px solid;
	width: 225px;
	height: 305px;
}

.item_img {
	width: 225px;
	height: 227px;
}

.item_des {
	font-size: 12px;
	color: #666;
	width: 210px;
	margin-left: 10px;
	line-height: 23px;
}

.item_money {
	font-weight: 900;
	color: #F00;
	margin-left:20px;
	font-size: 24px;
}
</style>
</head>

<body>
	<div class="main">
		<div class="info_title">推荐新品</div>
		<div class="info_content" id="info_content">
			<div class="item">
				<img class="item_img" alt="image" src="p.PNG" />
				<div class="item_des">正品全网通4G 5.5英寸大屏八核超薄智能手机</div>
				<span class="item_money">￥398</span>
			</div>
		</div>
		<div class="info_title">热门产品</div>
		<div class="info_content" id="remen_content">
			<div class="item">
				<img class="item_img" alt="image" src="p.PNG" />
				<div class="item_des">正品全网通4G 5.5英寸大屏八核超薄智能手机</div>
				<span class="item_money">￥398</span>
			</div>
		</div>
	</div>
	   <script type="text/javascript">
		var items=document.getElementById("info_content");
		for(var c=0;c<7;c++){
			var i=document.createElement("div");
			i.setAttribute("class","item");
			var i_img=document.createElement("img");
			var i_des=document.createElement("div");
			var i_line=document.createElement("span");
			var i_money=document.createElement("span");
			i_img.setAttribute("class","item_img");
			i_img.setAttribute("src","p.PNG");
			i_des.setAttribute("class","item_des");
			i_des.innerHTML="正品全网通4G 5.5英寸大屏八核超薄智能手机";
			i_line.innerHTML="￥";
			i_money.setAttribute("class","item_money");
			i_money.innerHTML="398";
			
			i.appendChild(i_img);
			i.appendChild(i_des);
			i.appendChild(i_line);
			i.appendChild(i_money);
			items.appendChild(i);
		}
		var items=document.getElementById("remen_content");
		for(var c=0;c<7;c++){
			var i=document.createElement("div");
			i.setAttribute("class","item");
			var i_img=document.createElement("img");
			var i_des=document.createElement("div");
			var i_line=document.createElement("span");
			var i_money=document.createElement("span");
			i_img.setAttribute("class","item_img");
			i_img.setAttribute("src","p.PNG");
			i_des.setAttribute("class","item_des");
			i_des.innerHTML="正品全网通4G 5.5英寸大屏八核超薄智能手机";
			i_line.innerHTML="￥";
			i_money.setAttribute("class","item_money");
			i_money.innerHTML="398";
			
			i.appendChild(i_img);
			i.appendChild(i_des);
			i.appendChild(i_line);
			i.appendChild(i_money);
			items.appendChild(i);
		}
	</script>
</body>
</html>
