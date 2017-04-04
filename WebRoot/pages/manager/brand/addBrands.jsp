<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>标签添加页</title>
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
			<strong>你当前的位置：</strong>[手机管理]>[分类管理]>[分类添加]
		</div>
		<form>
			<fieldset style="width:95%">
				<legend>分类编辑 </legend>
				<input type="hidden" name="brand.parentid" id="parentid" value="${brand.brandid }" />
				<span class="branditem">
					一级分类：<input type="text" disabled="disabled" value="${brand.brandname }" />
				</span>
				<span class="branditem"> 
					<input type="hidden" id="brandid" name="brand.brandid">
					子分类名：<input type="text" id="brandname" name="brand.brandname" />
				</span> 
				<span class="branditem">
					子分类描述：<textarea></textarea>
				</span> 
				<span class="branditem"> 
					<input type="button" onclick="add()" value="提交" style="width:40px;height:24px;" onmouseover="this.style.cursor='hand'" />
				</span>
			</fieldset>
		</form>
	</div>
	<script type="text/javascript" src="/js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript">
	
		function add() {
			var brandname = $("#brandname").val();
			var parentid = $("#parentid").val();

			var str = new Date().getTime();
			var value = "B" + str;
			$.ajax({
				url : '/shop/brand_addBrand.action',
				data : {
					"brand.brandid" : value,
					"brand.brandname" : brandname,
					"brand.parentid" : parentid
				},
				type : 'post',
				dataType : 'json',
				success : function(data) {
					window.location.href = "brand_pageQuery.action";
				},
				error : function(data) {
				}
			});
		}
	</script>
</body>
</html>
