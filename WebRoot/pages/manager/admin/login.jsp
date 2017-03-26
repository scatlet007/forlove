<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>管理员登录</title>
<style type="text/css">
body {
	font-size: 14px;
	background-color: #FFF;
	margin-left: auto;
	margin-right: auto;
}

.main {
	height: 860px;
	width: 1024px;
}

.login {
	width: 440px;
	height: 370px;
	margin-top: 130px;
	margin-right: 30px;
	float: right;
	border: #CCC 1px solid;
}

.top {
	height: 80px;
	margin-top: 30px;
	margin-left: 40px;
}

.loginTop {
	font-size: 18px;
	font-family: "Courier New", Courier, monospace;
	font-weight: bold;
}

.error {
	font-size: 12px;
	color: #F00;
	display: none;
}

.input {
	width: 240px;
	height: 38px;
	line-height:38px;
	padding-left: 8px;
	padding-top: 14px;
	margin-top: 10px;
}

.yzm {
	width: 80px;
}

.yzmimg {
	padding-left: 15px;
}

.loginBtn {
	width: 90px;
	height:30px;
	margin-right: 15px;
	background-color: #F93;
	color: #FFF;
	font-weight: bold;
}
.loginBtn:hover{
	width: 95px;
	height:35px;
}
.bgimg {
	margin-top: 130px;
	float: left;
	margin-left: 150px;
}
</style>
</head>

<body>
	<div class="main">
		<div class="bgimg">
			<img src="<%=basePath%>/imgs/telephone.jpg" width="300" height="380" />
		</div>
		<div class="login">
			<div class="top">
				<span class="loginTop">管理员登录 </span>
			</div>
			<form>
				<table style="margin-left:40px;">
					<tr>
						<td></td>
						<td><span class="error" id="errorDiv"></span></td>
					</tr>
					<tr>
						<td>用户名：</td>
						<td><input type="text" class="input"
							id="username" onblur="check('uname','username')"
							onfocus="retaire(document.getElementById('uname'))" /></td>
					</tr>
					<tr>
						<td></td>
						<td><span class="error" id="uname">用户名不能为空！</span></td>
					</tr>
					<tr>
						<td>密码：</td>
						<td><input type="text" class="input"
							id="password" onblur="check('pwd','password')"
							onfocus="retaire(document.getElementById('pwd'))" /></td>
					</tr>
					<tr>
						<td></td>
						<td><span class="error" id="pwd">密码不能为空！</span></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="button" id="login" class="loginBtn"
							value="登录" /> <input type="button" class="loginBtn" value="注册" />
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<script type="text/javascript"
		src="<%=basePath%>/js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript">
		function check(div,str)
		{
			var div2=document.getElementById(str);
			var val=div2.value+"";
			if(val==null||val=="")
				$("#div").show();
			else
				$("#div").hidden();
			
		}
		function retaire(div)
		{
			$("#div").hidden();
		}
		$(document).ready(function(){
    		$("#login").click(function(){
    			var name=$("#username").val();
    			var pwd=$("#password").val();
    			$.ajax({
    				url:'/shop/admin_login',
 					data:{"admin.adminname":name,"admin.password":pwd},
 					type:'post',
 					dataType:'json',
 					success:function(data){
 						$("#errorDiv").text(data.dataMap.user).show();
 						$("#yzm2").text(data.dataMap.yzm).show();
 						if(data.dataMap.isOK=="ok")
 							window.location.href="/shop/pages/manager/main.jsp";
 					},
 					error:function(data){
 					}
    			});
    		});
    	});
	</script>	
</body>
</html>
