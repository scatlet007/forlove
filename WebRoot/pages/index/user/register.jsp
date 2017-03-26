<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>注册</title>

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
	width: 1024px;
	height: 860px;
	margin-left: auto;
	margin-right: auto;
	background-color: #FFF;
}

.main {
	margin-top: 70px;
	margin-left: auto;
	margin-right: auto;
	border: #CCC 1px solid;
	width: 640px;
}

.divTitle {
	width: 640px;
	height: 26px;
	background-color: #ddd;
}

.title {
	font-size: 16px;
	font-weight: bold;
	line-height: 26px;
	margin-left: 20px;
}

.divTable {
	margin-top: 10px;
	margin-left: 100px;
	padding-bottom: 40px;
	font-size: 12px;
}

.input {
	margin-top: 10px;
	width: 230px;
	height: 26px;
}

.btn {
	background-color: #06F;
	color: #FFF;
}

.error {
	font-size: 9px;
	color: #F00;
	margin-left: 10px;
	display: none;
}
</style>
</head>

<body>
	<div class="main">
		<div class="divTitle">
			<div class="title">新用户注册</div>
		</div>
		<div class="regist">
			<form>
				<table class="divTable">
					<tr>
						<td>用户名：</td>
						<td>
							<input type="text" class="input" name="p.username" id="username"
								onblur="check('uname','username')"
								onfocus="retaire(document.getElementById('uname'))"
							/>
						</td>
						<td>
							<span class="error" id="uname">用户名不能为空！</span>
							<span style="color:red;font-size: 12px;" id="errorDiv">${dataMap.user }</span>
						</td>
					</tr>
					<tr>
						<td>登录密码：</td>
						<td>
							<input type="password" class="input" name="p.password" id="password"
								onblur="check('pwd','password')"
								onfocus="retaire(document.getElementById('pwd'))"
							/>
						</td>
						<td><span class="error" id="pwd">密码不能为空！</span></td>
					</tr>
					<tr>
						<td>确认密码：</td>
						<td>
							<input type="password" class="input" name="rpassword" id="rpassword"
								onblur="checkPwd()"
								onfocus="retaire(document.getElementById('rpwd'))"
							/>
						</td>
						<td><span class="error" id="rpwd">两次密码输入不同！</span></td>
					</tr>
					<tr>
						<td>Email:</td>
						<td>
							<input type="text" class="input" name="p.email" id="email" 
								onblur="check('e_mail','email')"
								onfocus="retaire(document.getElementById('e_mail'))"
							/>
						</td>
						<td><span class="error" id="e_mail">Email不能为空！</span></td>
					</tr>
					<tr>
						<td>验证码：</td>
						<td>
							<input type="text" class="input" name="yzm" id="securityCode"
								onblur="check('securityCode2','securityCode')"
								onfocus="retaire(document.getElementById('securityCode2'))"
							/>
						</td>
						<td>
							<span class="error" id="securityCode2">验证码不能为空！</span>
							<span style="color:red;font-size: 12px;" id="securityCode3">${dataMap.yzm }</span>
						</td>
					</tr>
					<tr>
						<td></td>
						<td><img alt="验证码" src="<%=basePath%>VerifyCodeServlet" id="codeImg"/> <a href="javascript:changeImg()">看不清，换一张</a>
						</td>
					</tr>
					<tr>
						<td></td>
						<td><input type="button" id="subBtn" class="input btn" value="立即注册" /></td>
						<td></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<script type="text/javascript"
		src="<%=basePath%>js/jquery-1.8.0.min.js"></script>
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
			var img=document.getElementById("codeImg");
			img.src="/shop/VerifyCodeServlet?a="+new Date().getTime();
			document.getElementById("yzm2").style.display="none";
			
		}
		function checkPwd()
		{
			var pwd=$("#password").val();
			var rpwd=$("#rpassword").val();
			if(pwd!=rpwd)
				document.getElementById("rpwd").style.display="block";
		}
		
		$(document).ready(function(){
    		$("#subBtn").click(function(){
    			var name=$("#username").val();
    			var pwd=$("#password").val();
    			var email=$("#email").val();
    			var yzm=$("#securityCode").val();
    			console.log(pwd);
    			$.ajax({
    				url:'/shop/user_register.action',
 					data:{
 						"p.username":name,
 						"p.password":pwd,
 						"yzm":yzm,
 						"p.email":email,
 						times:new Date().getTime()
 					},
 					type:'post',
 					dataType:'json',
 					success:function(data){
 						$("#errorDiv").text(data.dataMap.user).show();
 						$("#securityCode3").text(data.dataMap.yzm).show();
 						if(data.dataMap.isOK=="1")
 							window.location.href="/shop/test.jsp";
 					},
 					error:function(data){
 					}
    			});
    		});
    	});
	</script>
</body>
</html>
