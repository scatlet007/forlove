<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>商品展示效果</title>
<style type="text/css">
.main_content {
	width: 960px;
	background: #ddFFFF;
	float: left;
	margin-top: 30px;
	margin-left: 30px;
	margin-bottom: 100px;
	border: #ddd 1px solid;
}

.label_bar {
	width: 940px;
	height: 30px;
	float: left;
	padding-left: 20px;
	line-height: 30px;
	background: -webkit-linear-gradient(top, #FFF, #95FFFF);
	margin-bottom: 20px;
}

.content {
	width: 940px;
	height: 900px;
	float: left;
}

.content_info {
	width: 940px;
	height: 400px;
	float: left;
	margin-bottom: 15px;
	border-bottom: 1px solid #eee;
}

.content_info_left {
	width: 360px;
	height: 400px;
	float: left;
	margin-right: 5px;
}

.content_info_right {
	width: 540px;
	height: 400px;
	float: left;
	border: 1px #eee solid;
}

.content_bottom {
	width: 940px;
	height: 480px;
	float: left;
}

td {
	font-family: '微软雅黑';
	color: #aaa;
	padding-top: 10px;
}

td a {
	padding: 10px;
	border: 2px solid #ccc;
	float: left;
	margin-left: 10px;
	text-decoration:none;
}

td a:hover {
	cursor: hand;
	border: 2px solid red;
}

.btn {
	width: 120px;
	background-color: pink;
	height: 34px;
	line-height: 34px;
	border: 1px red solid;
	color: red;
	font-size: 16px;
	font-family: "微软雅黑";
	font-weight: 900;
}

.content_bottom_top {
	width: 940px;
	height: 40px;
	background-color: #eee;
	border-top: 1px solid #ccc;
	border-bottom: 1px solid #ccc;
}

.content_bottom_top a {
	width: 100px;
	height: 40px;
	display: block;
	float: left;
	text-align: center;
	line-height: 40px;
	color: #666;
	border: 1px solid #ccc;
}

.jichu {
	width: 940px;
	border: 1px solid #ddffff;
}

.jichu table tr td {
	color: black;
}

.title_info {
	width: 920px;
	height: 30px;
	background-color: #eee;
	line-height: 30px;
	color: block;
	font-size: 16px;
	padding-left: 20px;
	font-family: "微软雅黑";
}
</style>
</head>

<body>
	<div class="main_content">
		<div class="label_bar">
			<strong>手机信息</strong>
		</div>
		<div class="content">
			<div class="content_info">
				<div class="content_info_left">
					<img alt="展示图" src=""
						style="width:350px;height:400px;margin-left:5px;;">
				</div>
				<div class="content_info_right">
					<span
						style="margin-top:10px;margin-bottom:10px;font-size:16px;display:block;font-family:'微软雅黑';">
						新品【12期免息】HTC U Ultra 全网通双屏双卡双待HTC U-1w手机 </span>
					<table>
						<tr>
							<td width="90px">价格</td>
							<td><span style="color:red;">5088.00￥</span></td>
						</tr>
						<tr>
							<td width="90px">存储容量</td>
							<td><a href="#">32G</a> <a href="#">64G</a></td>
						</tr>
						<tr>
							<td width="90px">版本类型</td>
							<td><a href="#">中国大陆</a></td>
						</tr>
						<tr>
							<td width="90px">服务</td>
							<td><a href="#">延保一年</a></td>
						</tr>
						<tr>
							<td width="90px">数量</td>
							<td>
								<button style="height:30px;border:2px solid #ccc;"
									onmouseover="this.style.cursor='hand'">-</button> <input
								type="text"
								style="width:50px;height:30px;border:2px solid #ccc;">
								<button style="height:30px;border:2px solid #ccc;"
									onmouseover="this.style.cursor='hand'">+</button>
							</td>
						</tr>
						<tr>
							<td></td>
							<td>
								<button class="btn" onmouseover="this.style.cursor='hand'">
									立即购买</button>
								<button class="btn" style="background-color:red;color:#fff;"
									onmouseover="this.style.cursor='hand'">立即购买</button>
							</td>
						</tr>
					</table>
				</div>
			</div>
			<div class="content_bottom">
				<div class="content_bottom_top">
					<a href="javascript:changeDiv1()" id="a1"
						style="border:1px solid #ddFFFF;background-color:#ddFFFF;">基础信息</a>
					<a href="javascript:changeDiv2()" id="a2">详细信息</a>
				</div>
				<div class="jichu" id="jichu">
					<table>
						<tr>
							<td>品牌名称：</td>
							<td width="220px">HTC</td>
							<td></td>
							<td width="220px"></td>
							<td></td>
							<td width="220px"></td>
						</tr>
						<tr>
							<td>产品名称：</td>
							<td>HTC U-1W</td>
							<td>CPU型号：</td>
							<td>骁龙821</td>
							<td>CPU频率：</td>
							<td>2.5Hz</td>
						</tr>
						<tr>
							<td>运行内存：</td>
							<td>4G</td>
							<td>存储容量：</td>
							<td>32G</td>
							<td>网络模式：</td>
							<td>双卡双待</td>
						</tr>
						<tr>
							<td>电池容量</td>
							<td>30000mAh</td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
					</table>
				</div>
				<div class="jichu" id="desc" style="display:none;">
					<div class="title_info">屏幕</div>
					<table>
						<tr>
							<td width="110px">屏幕类型：</td>
							<td width="220px">电容屏</td>
							<td width="110px">主屏分辨率：</td>
							<td width="220px">1920x1080</td>
							<td width="110px">屏幕尺寸：</td>
							<td width="220px">5.5</td>
						</tr>
						<tr>
							<td>主屏材质：</td>
							<td width="220px">TFT材质</td>
							<td>屏幕色彩：</td>
							<td width="220px">26万色</td>
							<td>屏幕像素密度</td>
							<td width="220px">441PPI</td>
						</tr>
					</table>
					<div class="title_info">网络</div>
					<table>
						<tr>
							<td width="110px">网络支持：</td>
							<td colspan="3"></td>
							<td width="110px">SIM卡：</td>
							<td width="220px">双卡</td>
						</tr>
						<tr>
							<td width="110px">GPS：</td>
							<td width="220px">支持</td>
							<td width="110px">连接与共享：</td>
							<td width="220px">WLAN</td>
							<td width="110px"></td>
							<td width="220px"></td>
						</tr>
					</table>
					<div class="title_info">硬件</div>
					<table>
						<tr>
							<td width="110px">系统：</td>
							<td width="220px">777</td>
							<td width="110px">核心数：</td>
							<td width="220px">4核</td>
							<td width="110px">用户界面：</td>
							<td width="220px">3434</td>
						</tr>
						<tr>
							<td>CPU类型：</td>
							<td width="220px">2323</td>
							<td>CPU频率：</td>
							<td width="220px">3.5Hz</td>
							<td>GPU类型：</td>
							<td width="220px">44</td>
						</tr>
						<tr>
							<td>RAM:</td>
							<td width="220px">4G</td>
							<td>ROM:</td>
							<td width="220px">64G</td>
							<td>扩展容量：</td>
							<td width="220px">128G</td>
						</tr>
					</table>
					<div class="title_info">摄像头</div>
					<table>
						<tr>
							<td width="110px">摄像头类型：</td>
							<td width="220px">双摄像头</td>
							<td width="110px">前摄像头：</td>
							<td width="220px">1212</td>
							<td width="110px">后摄像头：</td>
							<td width="220px">3434</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		function changeDiv1()
		{
			var div1=document.getElementById("jichu");
			var div2=document.getElementById("desc");
			var a1=document.getElementById("a1");
			var a2=document.getElementById("a2");
			a1.style="border:1px solid #ddFFFF;background-color:#ddFFFF;";
			a2.style="";
			div1.style.display="block";
			div2.style.display="none";
			
		}
		function changeDiv2()
		{
			var div1=document.getElementById("jichu");
			var div2=document.getElementById("desc");
			var a2=document.getElementById("a2");
			a2.style="border:1px solid #ddFFFF;background-color:#ddFFFF;";
			a1.style="";
			div1.style.display="none";
			div2.style.display="block";
		}
	</script>
</body>
</html>
