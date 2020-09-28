<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<html>
	<head>
		<meta charset="UTF-8">
		<title>后台管理</title>
		<%@ include file="/pages/common/head.jsp" %>
		<style type="text/css">
			h1 {
				text-align: center;
				margin-top: 200px;
			}
		</style>
	</head>
	<body>

		<div id="header">
			<img class="logo_img" alt="" src="../../static/img/logo.gif">
			<span class="wel_word">后台管理系统</span>
			<div>
				<a href="manager/GoodsServlet?action=page">商品管理</a>
				<a href="order_manager.jsp">订单管理</a>
				<a href="index.jsp">返回商城</a>
			</div>
		</div>

		<div id="main">
			<h1>欢迎管理员进入后台管理系统</h1>
		</div>

		<%--静态包含页脚内容--%>
		<%@include file="/pages/common/footer.jsp" %>
	</body>
</html>
