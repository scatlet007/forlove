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
<style type="text/css">
.main_content{
	width:960px;
	background:#ddFFFF;
	float:left;
	margin-top:30px;
	margin-left:30px;
	margin-bottom:100px;
	border:#ddd 1px solid;
}	
.label_bar{
	width:940px;
	height:30px;
	float:left;
	padding-left:20px;
	line-height:30px;	
	background: -webkit-linear-gradient(top, #FFF, #95FFFF);
	margin-bottom:20px;
}
.branditem{
	display:block;
	margin-left:100px;
	margin-top:20px;
}
.branditem input{
	width:200px;
	height:30px;
	border:#ccc 1px solid;
}
.branditem textArea{
	width:340px;
	height:112px;
}
</style>
</head>

<body>
	<div class="main_content">
		<div class="label_bar">
			<strong>你当前的位置：</strong>[手机管理]>[添加手机信息]
		</div>
		<form action="goods_addPhone.action" method="post" enctype="multipart/form-data">
			<span class="branditem">手机名<input type="text" name="phone.phonename" value=""/></span>
			<span class="branditem">商品显示标题：<input type="text" name="phone.title" value=""/></span>
			<span class="branditem">商品价格<input type="text" name="phone.price" value=""/></span>
			<span class="branditem">归属分类
				<select  id="parent">
					<c:forEach var="been" items="${been }">
						<option value="${been.brandid }">${been.brandname }</option>
					</c:forEach>
				</select>
				<span>
					<select  id="child" name="phone.brandid">
					<c:forEach var="been" items="${child }">
						<option value="${been.brandid }">${been.brandname }</option>
					</c:forEach>
				</select>
				</span>
			</span>
			<span class="branditem">显示图片：<input type="file" name="file" value=""/></span>
			<span class="branditem">
				<input type="submit" value="提交" style="width:40px;height:24px;" onmouseover="this.style.cursor='hand'"/>
			</span>
		</form>
	</div>
	<script type="text/javascript"
		src="<%=basePath%>/js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#parent").bind("change",function(){
    			var pid=document.getElementById("parent");
    			var value=pid.options[pid.selectedIndex].value;
    			$.ajax({
    				url:'/shop/goods_getChildBrand.action',
 					data:{"pid":value},
 					type:'post',
 					dataType:'json',
 					success:function(data){
 						var p=document.getElementById("child");
 						p.innerHTML="";
 						for(var i=0;i<data.brandlist.length;i++)
 						{
 							var option=document.createElement("option");
 							option.setAttribute("value", data.brandlist[i].brandid);
 							option.innerHTML=data.brandlist[i].brandname;
 							p.appendChild(option);
 						}
 						
 					},
 					error:function(data){
 					}
    			});
    		});
		});
	</script>
</body>
</html>
