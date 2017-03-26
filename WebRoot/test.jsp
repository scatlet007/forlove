<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>测试用</title>


</head>

<body>
	<form action="image_upload.action" enctype="multipart/form-data" method="post">
		<input type="file" name="file"/><br/>
		<input type="submit" value="提交"/>
	</form>
	<script type="text/javascript">
		var brandid=document.getElementById("brandid");
		brandid.setAttribute("value", "B"+new Date().getTime());
	</script>
</body>
</html>
