<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<html>
	<head>
		<meta charset="UTF-8">
		<title>购物车</title>
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
	</head>
	<body>

		<div id="header">
			<img class="logo_img" alt="" src="static/img/logo.gif"/>
			<span class="wel_word">购物车</span>
			<div>
				<span>欢迎<span class="um_span">用户</span>光临网上商城</span>
				<a href="pages/order/order.html">我的订单</a>
				<a href="index.html">注销</a>&nbsp;&nbsp;
				<a href="index.html">返回</a>
			</div>
		</div>

		<div id="main">

			<table>
				<tr>
					<td>商品名称</td>
					<td>数量</td>
					<td>单价</td>
					<td>金额</td>
					<td>操作</td>
				</tr>
				<tr>
					<td>滚筒洗衣机</td>
					<td>2</td>
					<td>500.00</td>
					<td>1000.00</td>
					<td><a href="#">删除</a></td>
				</tr>

				<tr>
					<td>母猪的产后护理</td>
					<td>1</td>
					<td>10.00</td>
					<td>10.00</td>
					<td><a href="#">删除</a></td>
				</tr>

				<tr>
					<td>秘制小憨包</td>
					<td>1</td>
					<td>20.00</td>
					<td>20.00</td>
					<td><a href="#">删除</a></td>
				</tr>

			</table>

			<div class="cart_info">
				<span class="cart_span">购物车中共有<span class="b_count">4</span>件商品</span>
				<span class="cart_span">总金额<span class="b_price">90.00</span>元</span>
				<span class="cart_span"><a href="#">清空购物车</a></span>
				<span class="cart_span"><a href="pages/cart/checkout.html">去结账</a></span>
			</div>

		</div>

		<div id="bottom">
			<span>
				网上商城.Copyright &copy;2020
			</span>
		</div>
	</body>
</html>
