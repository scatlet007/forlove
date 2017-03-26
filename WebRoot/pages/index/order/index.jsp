<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>订单主页</title>
<style>
.content{
	width:1030px;
	height:300px;
	margin-left:20px;
	margin-top:20px;
}
.list{
	width:1030px;
	margin-bottom:50px;
}
.info_title{
	width:1020px;
	height:40px;
	padding-left:10px;
	line-height: 40px;
	font-family:"华文彩云";
	font-size: 24px;
}
.table_title{
	width:1030px;
	height:30px;
	background-color:#ddd;
	line-height:30px;
}
.info_body{
	width:1030px;
}
.info_body table tr td{
	border:1px dotted #ccc;
	text-align:center;
	height:30px;
	line-height:30px;
	font-size: 12px;
}
.info_body table tr:hover{
	background-color:#eee;
	height:35px;
	line-height:35px;
}
a{
	text-decoration:none;
}
.number{
	margin-top:30px;
	text-align:center;
	font-size:12px;
}
</style>
</head>

<body>
	<div class="content">
		<div class="list">
			<div class="info_title">
				我的订单列表
			</div>
			<div class="table_title">
				<span style="margin-left:40px;margin-right:40px;">订单号</span>
				<span style="margin-left:40px;margin-right:40px;">下单时间</span>
				<span style="margin-left:140px;margin-right:140px;">收货地址</span>
				<span style="margin-left:30px;margin-right:30px;">金额</span>
				<span style="margin-left:40px;margin-right:40px;">订单状态</span>
				<span style="margin-left:30px;margin-right:30px;">操作</span>
			</div>
			<div class="info_body">
				<table cellspacing="0">
					<tr>
						<td width="142px;">Order201703190004</td>
						<td width="112px;">2017/03/19</td>
						<td width="382px;">南宁市/良庆区/良庆镇/坛泽村/榨油坡/14号</td>
						<td width="82px;color:red;">450￥</td>
						<td width="147px;">(未支付)</td>
						<td width="152px;">
							<a href="#">支付</a>
							<a href="#">删除</a>
							<a href="#">查看</a>
						</td>
					</tr>
					<tr>
						<td width="142px;">Order201703190004</td>
						<td width="112px;">2017/03/19</td>
						<td width="382px;">南宁市/良庆区/良庆镇/坛泽村/榨油坡/14号</td>
						<td width="82px;color:red;">450￥</td>
						<td width="147px;">(未支付)</td>
						<td width="152px;">
							<a href="#">支付</a>
							<a href="#">删除</a>
							<a href="#">查看</a>
						</td>
					</tr>
					<tr>
						<td width="142px;">Order201703190004</td>
						<td width="112px;">2017/03/19</td>
						<td width="382px;">南宁市/良庆区/良庆镇/坛泽村/榨油坡/14号</td>
						<td width="82px;color:red;">450￥</td>
						<td width="147px;">(未支付)</td>
						<td width="152px;">
							<a href="#">支付</a>
							<a href="#">删除</a>
							<a href="#">查看</a>
						</td>
					</tr>
					<tr>
						<td width="142px;">Order201703190004</td>
						<td width="112px;">2017/03/19</td>
						<td width="382px;">南宁市/良庆区/良庆镇/坛泽村/榨油坡/14号</td>
						<td width="82px;color:red;">450￥</td>
						<td width="147px;">(未支付)</td>
						<td width="152px;">
							<a href="#">支付</a>
							<a href="#">删除</a>
							<a href="#">查看</a>
						</td>
					</tr>
					<tr>
						<td width="142px;">Order201703190004</td>
						<td width="112px;">2017/03/19</td>
						<td width="382px;">南宁市/良庆区/良庆镇/坛泽村/榨油坡/14号</td>
						<td width="82px;color:red;">450￥</td>
						<td width="147px;">(未支付)</td>
						<td width="152px;">
							<a href="#">支付</a>
							<a href="#">删除</a>
							<a href="#">查看</a>
						</td>
					</tr>
				</table>
				<div class="number">
					共12页，当前第4页 
					<a href="#">上一页</a>
					<a href="#">1</a>
					<a href="#">2</a>
					<a href="#">3</a>
					<a href="#">4</a>
					<a href="#">5</a>
					<a href="#">6</a>
					<a href="#">下一页</a>
					<input type="text" style="width:50px;">
					<button>go</button>
				</div>
			</div>
		</div>
		
		<div class="list">
			<div class="info_title">
				订单的详细信息
			</div>
			<div class="table_title">
				<span style="margin-left:20px;margin-right:20px;">商品图标</span>
				<span style="margin-left:40px;margin-right:40px;">归属订单号</span>
				<span style="margin-left:180px;margin-right:180px;">商品标题</span>
				<span style="margin-left:30px;margin-right:30px;">单价</span>
				<span style="margin-left:30px;margin-right:30px;">数量</span>
				<span style="margin-left:20px;margin-right:20px;">总金额</span>
			</div>
			<div class="info_body">
				<table cellspacing="0">
					<tr>
						<td width="132px;">
							<img alt="icon" src="" style="width:50px;height:50px;"/>
						</td>
						<td width="112px;">2017/03/19</td>
						<td width="460px;">南宁市/良庆区/良庆镇/坛泽村/榨油坡/14号</td>
						<td width="82px;color:red;">450￥</td>
						<td width="100px;">3</td>
						<td width="120px;">
							1254￥
						</td>
					</tr>
					<tr>
						<td width="132px;">
							<img alt="icon" src="" style="width:50px;height:50px;"/>
						</td>
						<td width="112px;">2017/03/19</td>
						<td width="460px;">南宁市/良庆区/良庆镇/坛泽村/榨油坡/14号</td>
						<td width="82px;color:red;">450￥</td>
						<td width="100px;">3</td>
						<td width="120px;">
							1254￥
						</td>
					</tr>
					<tr>
						<td width="132px;">
							<img alt="icon" src="" style="width:50px;height:50px;"/>
						</td>
						<td width="112px;">2017/03/19</td>
						<td width="460px;">南宁市/良庆区/良庆镇/坛泽村/榨油坡/14号</td>
						<td width="82px;color:red;">450￥</td>
						<td width="100px;">3</td>
						<td width="120px;">
							1254￥
						</td>
					</tr>
				</table>
				<div class="number">
					共12页，当前第4页 
					<a href="#">上一页</a>
					<a href="#">1</a>
					<a href="#">2</a>
					<a href="#">3</a>
					<a href="#">4</a>
					<a href="#">5</a>
					<a href="#">6</a>
					<a href="#">下一页</a>
					<input type="text" style="width:50px;">
					<button>go</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
