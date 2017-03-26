<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>分类管理</title>
<style type="text/css">
.main_info {
	width: 960px;
	background: #ddFFFF;
	float: left;
	margin-top: 30px;
	margin-left: 30px;
	margin-bottom: 100px;
	border: #ddd 1px solid;
}

.addcategoryhref {
	margin-left: auto;
	margin-right: auto;
	margin-top: 20px;
	text-align: center;
}

.addcategoryhref a {
	text-decoration: none;
}

.info_table {
	margin-left: 100px;;
	margin-top: 10px;
}

.searchBar {
	width: 934px;
	height: 100px;
	text-align: center;
	border-bottom: #999 1px solid;
}

.searchBar input {
	border: #999 2px solid;
	width: 200px;
	height: 30px;
	float: left;
	margin-left: 400px;
	margin-top: 20px;
}

.searchBar button {
	float: left;
	margin-top: 20px;
	margin-left: 2px;
}

.label_bar {
	width: 940px;
	height: 30px;
	float: left;
	padding-left: 20px;
	line-height: 30px;
	background: -webkit-linear-gradient(top, #FFF, #95FFFF);
}

.brandtitle {
	background-color: #ddd;
	text-align: left;
	font-size: 18px;
	font-weight: 800px;
}

tr:hover {
	background-color: #aaa;
}

td {
	font-family: "微软雅黑";
	padding: 5px;
}

.branditem {
	text-align: right;
	font-size: 14px;
	background-color: #eee;
}

.numberBar {
	margin-left: 150px;
	margin-top: 20px;
	padding-bottom: 30px;
}
</style>
</head>

<body>
	<div class="main_info">
		<div class="label_bar">
			<strong>你当前的位置：</strong>[手机管理]>[分类管理]>[分类列表]
		</div>
		<div class="searchBar">
			<input type="text" />
			<button>
				<img src="/shop/imgs/search_24px.png" />
			</button>
		</div>
		<div class="addcategoryhref">
			<a href="brand_toAddBrand.action">添加一级分类</a>
		</div>
		<div class="info_table">
			<table>
				<tr>
					<td
						style="background-color:#2d2d2d;color:#fff;width:170px;text-align:center;">分类名称</td>
					<td
						style="background-color:#2d2d2d;color:#fff;width:400px;text-align:center;">描述</td>
					<td
						style="background-color:#2d2d2d;color:#fff;width:170px;text-align:center;">操作</td>
				</tr>
				<c:forEach var="item" items="${pagebean.list}">
					<c:if test="${item.brandid==item.pid }">
						<tr class="brandtitle">
							<td>${item.brandname }</td>
							<td></td>
							<td><a href="goods_toupdate?brandid=${item.brandid }">修改</a>
								<a href="goods_delete?brandid=${item.brandid }">删除</a></td>
						</tr>
					</c:if>
					<c:if test="${item.brandid!=item.pid }">
						<tr class="branditem">
							<td>${item.brandname }</td>
							<td></td>
							<td><a href="goods_toaddBrand?brandid=${item.pid }">添加二级分类</a>
								<a href="goods_toupdate?brandid=${item.brandid }">修改</a> <a
								href="goods_delete?brandid=${item.brandid }">删除</a></td>
						</tr>
					</c:if>

				</c:forEach>
			</table>
			<div class="numberBar">
				共[${pagebean.totalrecord }]条记录, 每页<input type="text" id="pagesize"
					value="${pagebean.pagesize }"
					onchange="gotopage(${pagebean.currentpage })" style="width: 30px"
					maxlength="2">条, 共[${pagebean.totalpage }]页,
				当前[${pagebean.currentpage }]页 &nbsp;&nbsp;&nbsp; <a
					href="javascript:void(0)"
					onclick="gotopage(${pagebean.previouspage })">上一页</a>
				<c:forEach var="pagenum" items="${pagebean.pagebar}">
					<c:if test="${pagenum==pagebean.currentpage}">
						<font color="red">${pagenum }</font>
					</c:if>

					<c:if test="${pagenum!=pagebean.currentpage}">
						<a href="javascript:void(0)" onclick="gotopage(${pagenum })">${pagenum }</a>
					</c:if>
				</c:forEach>
				<a href="javascript:void(0)"
					onclick="gotopage(${pagebean.nextpage })">下一页</a> <input
					type="text" id="pagenum" style="width: 30px"> <input
					type="button" value=" GO "
					onclick="gotopage(document.getElementById('pagenum').value)">
			</div>
		</div>
	</div>
	<script type="text/javascript">
    	function gotopage(currentpage){  	
    		var pagesize = document.getElementById("pagesize").value;
    		window.location.href = '${pageContext.request.contextPath}/brand_pageQuery.action?queryInfo.currentpage=' + currentpage + '&queryInfo.pagesize=' + pagesize;
    	}
    </script>
</body>
</html>
