<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>支付成功</title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/ordersucc.css'">
<style>
.content{
	margin-left:250px;;
	margin-top:100px;
}
</style>
</head>

<body>
<div class="content">
	<div class="div1">
		<span class="span1">订单已生成</span>
	</div>
	<div class="div2">
		<img src="<c:url value='/imgs/duihao.jpg'/>" class="img" />
		<dl>
			<dt>订单编号</dt>
			<dd>${order.oid }</dd>
			<dt>合计金额</dt>
			<dd>
				<span class="price_t">&yen;${order.total }</span>
			</dd>
			<dt>收货地址</dt>
			<dd>${order.address }</dd>
		</dl>
		<span>阿卡琳手机商城感谢您的支持，祝您购物愉快！</span> <a
			href="<c:url value='/OrderServlet?method=paymentPre&oid=${order.oid }'/>"
			id="linkPay">支付</a>
	</div>
</div>
</body>
</html>
