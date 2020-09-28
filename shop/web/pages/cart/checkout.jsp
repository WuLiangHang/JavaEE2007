<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<html>
	<head>
		<meta charset="UTF-8">
		<title>结算页面</title>
		<%
			String basePath = request.getScheme()
					+ "://"
					+ request.getServerName()
					+ ":"
					+ request.getServerPort()
					+ request.getContextPath()
					+ "/";
		%>
		<!--写base 标签，永远固定相对路径跳转的结果-->
		<base href="<%=basePath%>">
		<link type="text/css" rel="stylesheet" href="static/css/style.css">
		<link href="static/css/bootstrap.min.css" rel="stylesheet" />
		<script src="static/js/jquery-1.11.3.min.js"></script>
		<script src="static/js/bootstrap.js"></script>
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
			<span class="wel_word">结算</span>
			<div>
				<span>欢迎<span class="um_span">用户</span>光临网上商城</span>
				<a href="../order/order.jsp">我的订单</a>
				<a href="../../index.html">注销</a>&nbsp;&nbsp;
				<a href="../../index.html">返回</a>
			</div>
		</div>

		<div id="main">

			<h1>你的订单已结算，订单号为2937474382928484747</h1>


		</div>

		<div id="bottom">
			<span>
				网上商城.Copyright &copy;2020
			</span>
		</div>
	</body>
</html>
