<%@page import="shop.entity.Brand"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>添加手机</title>
<base href="<%=basePath%>">
<%-- <link rel="stylesheet" type="text/css" href="<%=basePath%>css/amazeui.css"> --%>
<script type="text/javascript" charset="utf-8" src="/shop/js/addCellphoneDesc.js"></script>
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

.branditem {
	display: block;
	margin-left: 100px;
	margin-top: 20px;
}

.branditem input {
	width: 200px;
	height: 30px;
	border: #ccc 1px solid;
}

.branditem textArea {
	width: 340px;
	height: 112px;
}
.phone{
	width:934px;
	margin:10px;
	float:left;
}
.tag_bar{
	width:850px;
	float:left;
}
.tag_item{
	padding:10px;
	display:block;
	float:left;
	margin-left:2px;
	border-left:1px #06ffff solid;
	border-top:1px #06ffff solid;
	border-right:1px #06ffff solid;
	background-color:#06ffff;
}
.phone_info{
	width:850px;
	float:left;
	margin-bottom:10px;
	padding:20px;
	border:#4AFFFF 1px solid;
}
.info-table{
	width:800px;
}
.info-table tr td{
	padding:10px;
}
</style>
</head>

<body>
	<div class="main_content">
		<div class="label_bar">
			<strong>你当前的位置：</strong>[手机管理]>[添加手机信息]
		</div>
		<div class="phone">
			<div class="tag_bar">
				<a href="javascript:getDiv(0)" id="tag0" style="background-color:#ddffff;" class="tag_item">屏幕</a> <a
					href="javascript:getDiv(1)" id="tag1" class="tag_item">网络</a> <a
					href="javascript:getDiv(2)" id="tag2" class="tag_item">硬件</a> <a
					href="javascript:getDiv(3)" id="tag3" class="tag_item">摄像头</a> <a
					href="javascript:getDiv(4)" id="tag4" class="tag_item">服务特色</a> <a
					href="javascript:getDiv(5)" id="tag5" class="tag_item">图片</a>
			</div>
			<div class="phone_info" id="screen" style="display:block;">
				<form action="" class="am-form">
					<input type="hidden" name="" value=""/>
					<div class="am-form-group">
						<label>屏幕类型</label>
						<input type="text" class="am-input-sm" placeholder="请输入屏幕类型">
					</div>
					<div class="am-form-group">
						<label>屏幕分辨率</label>
						<input type="text" class="am-input-sm" placeholder="请输入屏幕类型">
					</div>
					<div class="am-form-group">
						<label>像素密度</label>
						<input type="text" class="am-input-sm" placeholder="请输入屏幕类型">
					</div>
					<div class="am-form-group">
						<label>屏幕材质</label>
						<input type="text" class="am-input-sm" placeholder="请输入屏幕类型">
					</div>
					<div class="am-form-group">
						<label>屏幕色彩</label>
						<input type="text" class="am-input-sm" placeholder="请输入屏幕类型">
					</div>
					<div class="am-form-group">
						<button class="am-btn am-btn-default">提交</button>
					</div>
				</form>
			</div>
			<div class="phone_info" id="internet" style="display:none;">
				<form action="" class="am-form">
					<input type="hidden" name="" value=""/>
					<table class="info-table">
						<tr>
							<td>SIM卡类型</td>
							<td><input type="text"></td>
							<td>WLAN功能</td>
							<td><input type="text"></td>
						</tr>
						<tr>
							<td>导航</td>
							<td><input type="text"></td>
							<td>连接与共享</td>
							<td><input type="text"></td>
						</tr>
					</table>
					<table class="info-table" id="item">
						<tr>
							<td>网络类型</td>
							<td><input type="text"></td>
							<td>网络类型</td>
							<td><input type="text"></td>
							<td><a class="am-btn am-btn-default" href="javascript:add()">
									+ </a></td>
						</tr>
					</table>
					<div class="am-form-group">
						<button class="am-btn am-btn-default">提交</button>
					</div>
				</form>
			</div>
			<div class="phone_info" id="diy" style="display:none;">
				<form action="" class="am-form">
					<input type="hidden" name="" value=""/>
					<table class="info-table">
						<tr>
							<td>系统名</td>
							<td><input type="text"></td>
							<td>核心数</td>
							<td><select>
									<option value=1>1</option>
									<option value="2">2</option>
									<option value="4">4</option>
									<option value="8">8</option>
							</select></td>
						</tr>
						<tr>
							<td>用户界面</td>
							<td><input type="text"></td>
							<td>CPU类型</td>
							<td><input type="text"></td>
						</tr>
						<tr>
							<td>CPU频率</td>
							<td><input type="text"></td>
							<td>GPU类型</td>
							<td><input type="text"></td>
						</tr>
						<tr>
							<td>RAM容量</td>
							<td><select>
									<option value=1>1G</option>
									<option value="2">2G</option>
									<option value="4">4G</option>
									<option value="8">8G</option>
							</select></td>
							<td>ROM容量</td>
							<td><select>
									<option value="1">1G</option>
									<option value="2">2G</option>
									<option value="4">4G</option>
									<option value="8">8G</option>
									<option value="16">16G</option>
									<option value="32">32G</option>
									<option value="64">64G</option>
									<option value="128">128G</option>
							</select></td>
						</tr>
						<tr>
							<td>是否支持扩展内存</td>
							<td><select>
									<option value="0">不可扩展</option>
									<option value="1">支持扩展</option>
							</select></td>
							<td>可扩展容量</td>
							<td><select>
									<option value="16">16G</option>
									<option value="32">32G</option>
									<option value="64">64G</option>
									<option value="128">128G</option>
									<option value="1024">1T</option>
									<option value="2048">2T</option>
							</select></td>
						</tr>
					</table>
					<div class="am-form-group">
						<button class="am-btn am-btn-default">提交</button>
					</div>
				</form>
			</div>
			<div class="phone_info" id="camera" style="display:none;">
				<form action="" class="am-form">
					<input type="hidden" name="" value=""/>
					<table class="info-table">
						<tr>
							<td>摄像头类型</td>
							<td><input type="text"></td>
							<td>前置摄像头</td>
							<td><input type="text"></td>
						</tr>
						<tr>
							<td>后置摄像头</td>
							<td><input type="text"></td>
							<td></td>
							<td></td>
						</tr>
					</table>
					<div class="am-form-group">
						<button class="am-btn am-btn-default">提交</button>
					</div>
				</form>
			</div>
			<div class="phone_info" id="support" style="display:none;">
				<form action="" class="am-form">
					<input type="hidden" name="" value=""/>
					<div class="am-form-group">
						<label>音频支持</label>
						<input type="text" placeholder="数据用','分割如：mp3,wav">
					</div>
					<div class="am-form-group">
						<label>视频支持</label>
						<input type="text" placeholder="数据用','分割如：jpg,jpeg">
					</div>
					<div class="am-form-group">
						<label>图片支持</label>
						<input type="text" placeholder="数据用','分割如：jpg,jpeg">
					</div>
					<div class="am-form-group">
						<label>常用功能</label>
						<input type="text" placeholder="数据用','分割如：jpg,jpeg">
					</div>
					<div class="am-form-group">
						<label>商务功能</label>
						<input type="text" placeholder="数据用','分割如：jpg,jpeg">
					</div>
					<div class="am-form-group">
						<label>服务特色</label>
						<input type="text" placeholder="数据用','分割如：jpg,jpeg">
					</div>
					<div class="am-form-group">
						<button class="am-btn am-btn-default">提交</button>
					</div>
				</form>
			</div>
			<div class="phone_info" id="picture" style="display:none;">
				<form action="">
					<input type="hidden" name="" value=""/>
						<table id="img_item">
							<tr>
								<td><input type="file"></td>
								<td><a class="am-btn am-btn-default" href="javascript:addPicture()">+</a></td>
							</tr>
						</table>
					<div class="am-form-group">
						<button class="am-btn am-btn-default">提交</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
