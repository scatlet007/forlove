<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>登录</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
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
	width: 220px;
	height: 26px;
	padding-left: 8px;
	padding-top: 4px;
}

.yzm {
	width: 80px;
}

.yzmimg {
	padding-left: 15px;
}

.loginBtn {
	width: 90px;
	margin-right: 15px;
	background-color: #F93;
	color: #FFF;
	font-weight: bold;
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
				<span class="loginTop"> 阿卡琳会员登录 </span>
			</div>
			<form action="user_login" method="post">
				<table style="margin-left:40px;">
					<tr>
						<td></td>
						<td><span class="error" id="errorDiv"></span></td>
					</tr>
					<tr>
						<td>用户名：</td>
						<td><input type="text" class="input" name="p.username"
							id="username" onblur="check('uname','username')"
							onfocus="retaire(document.getElementById('uname'))" /></td>
					</tr>
					<tr>
						<td></td>
						<td><span class="error" id="uname">用户名不能为空！</span></td>
					</tr>
					<tr>
						<td>密码：</td>
						<td><input type="text" class="input" name="p.password"
							id="password" onblur="check('pwd','password')"
							onfocus="retaire(document.getElementById('pwd'))" /></td>
					</tr>
					<tr>
						<td></td>
						<td><span class="error" id="pwd">密码不能为空！</span></td>
					</tr>
					<tr>
						<td>验证码：</td>
						<td><input type="text" class="input yzm" name="yzm"
							id="yanzhengma" onblur="check('yzm','yanzhegnma')"
							onfocus="retaire(document.getElementById('yzm'))" /> <img
							class="yzmimg" id="yzmimg" src="<%=basePath%>VerifyCodeServlet" />
						</td>
						<td><a href="javascript:changeImg()">换张图</a></td>
					</tr>
					<tr>
						<td></td>
						<td><span class="error" id="yzm">验证码不能为空！</span> <span
							class="error" id="yzm2"></span></td>
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
			var div1=document.getElementById(div);
			var div2=document.getElementById(str);
			var val=div2.value+"";
			if(val==null||val=="")
				div1.style.display="block";
			else
				div1.style.display="none";
			
		}
		function retaire(div)
		{
			div.style.display="none";
		}
		function changeImg()
		{
			var img=document.getElementById("yzmimg");
			img.src="/shop/VerifyCodeServlet?a="+new Date().getTime();
			document.getElementById("yzm2").style.display="none";
			
		}
		$(document).ready(function(){
    		$("#login").click(function(){
    			var name=$("#username").val();
    			var pwd=$("#password").val();
    			var yzm=$("#yanzhengma").val();
    			$.ajax({
    				url:'/shop/user_login',
 					data:{"username":name,"password":pwd,"yzm":yzm},
 					type:'post',
 					dataType:'json',
 					success:function(data){
 						$("#errorDiv").text(data.dataMap.user);
 						$("#yzm2").text(data.dataMap.yzm);
 						document.getElementById("errorDiv").style.display="block";
 						document.getElementById("yzm2").style.display="block";
 						if(data.dataMap.isOK=="1")
 							window.location.href="/shop/pages/index/main.jsp";
 					},
 					error:function(data){
 					}
    			});
    		});
    	});
	</script>
</body>
</html>
