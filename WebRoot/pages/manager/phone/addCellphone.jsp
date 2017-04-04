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
		<form>
			<span class="branditem">
				手机名<input type="text" id="phonename" name="phone.phonename" value=""/>
			</span>
			<span class="branditem">
				商品显示标题：<input type="text" id="title" name="phone.title" value=""/>
			</span>
			<span class="branditem">
				商品价格<input type="text" id="price" name="phone.price" value=""/>
			</span>
			<span class="branditem">
				归属分类
				<select  id="parent">
					<c:forEach var="been" items="${listParent }">
						<option value="${been.brandid }">${been.brandname }</option>
					</c:forEach>
				</select>
				<span>
					<select  id="child" name="phone.brandid">
					</select>
				</span>
			</span>
			<span class="branditem">
				<input type="button" onclick="add()" value="提交" style="width:40px;height:24px;" onmouseover="this.style.cursor='hand'"/>
			</span>
		</form>
	</div>
	<script type="text/javascript"
		src="<%=basePath%>/js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript">
		function parent() {
			alert(100);
			$.ajax({
				url:'/shop/brand_getParents.action',
					data:{},
					type:'post',
					dataType:'json',
					success:function(data){
						var p=document.getElementById("parent");
						p.innerHTML="";
						for(var i=0;i<data.listParent.length;i++)
						{
							var option=document.createElement("option");
							option.setAttribute("value", data.listParent[i].brandid);
							option.innerHTML=data.listParent[i].brandname;
							p.appendChild(option);
						}
						
					},
					error:function(data){
					}
			});
		}
		setTimeout("parent()", 2000);
		$(document).ready(
			function() {
				$("#parent").bind("change",function() {
					var pid = document.getElementById("parent");
					var value = pid.options[pid.selectedIndex].value;
					$.ajax({
							url : '/shop/brand_getChild.action',
							data : {
										"parentid" : value
								},
							type : 'post',
							dataType : 'json',
							success : function(data) {
								var p = document.getElementById("child");
								p.innerHTML = "";
								for (var i = 0; i < data.listChild.length; i++) {
									var option = document.createElement("option");
									option.setAttribute("value",data.listChild[i].brandid);
									option.innerHTML = data.listChild[i].brandname;
									p.appendChild(option);
							}
						}
					});
				});
				
			});
		function add() {
			$.ajax({
					url : '/shop/goods_add.action',
					data : {
						"phone.phonename":$("#phonename").val(),
						"phone.title":$("#title").val(),
						"phone.price":$("#price").val(),
						"phone.brandid":$("#child").find("option:selected").val(),
					},
					type : 'post',
					dataType : 'json',
					success : function(data) {
						alert("ok!");
					},
					error : function(data) {
					}
				});
			}
	</script>
</body>
</html>
