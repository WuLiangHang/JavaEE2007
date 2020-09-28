<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>商城首页</title>
    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/pages/common/head.jsp" %>
</head>
<body>
<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <span class="wel_word">网上商城</span>
    <div>
        <a href="pages/user/login.jsp">登录</a> |
        <a href="pages/user/regist.jsp">注册</a> &nbsp;&nbsp;
        <a href="pages/cart/cart.jsp">购物车</a>
        <a href="pages/manager/manager.jsp">后台管理</a>
    </div>
</div>

<div id="main">
    <div id="goods">
        <div class="goods_cond">
            <form action="client/GoodsServlet" method="get">
                <input type="hidden" name="action" value="pageByPrice">
                价格：<input id="min" type="text" name="min" value="${param.min}"> 元 -
                <input id="max" type="text" name="max" value="${param.max}"> 元
                <input type="submit" value="查询"/>
            </form>
        </div>
        <div style="text-align: center">
            <span>您的购物车中有3件商品</span>
            <div>
                您刚刚将<span style="color: red">时间简史</span>加入到了购物车中
            </div>
        </div>

        <c:forEach items="${requestScope.page.items}" var="goods">
            <div class="b_list">
                <div class="img_div">
                    <img class="goods_img" alt="" src="${goods.imgPath}"/>
                </div>
                <div class="goods_info">
                    <div class="goods_name">
                        <span class="sp1">名称:</span>
                        <span class="sp2">${goods.name}</span>
                    </div>
                    <div class="goods_producer">
                        <span class="sp1">生产商:</span>
                        <span class="sp2">${goods.producer}</span>
                    </div>
                    <div class="goods_price">
                        <span class="sp1">价格:</span>
                        <span class="sp2">￥${goods.price}</span>
                    </div>
                    <div class="goods_sales">
                        <span class="sp1">销量:</span>
                        <span class="sp2">${goods.sales}</span>
                    </div>
                    <div class="goods_amount">
                        <span class="sp1">库存:</span>
                        <span class="sp2">${goods.stock}</span>
                    </div>
                    <div class="goods_add">
                        <button>加入购物车</button>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>

    <%--静态包含分页条--%>
    <%@include file="/pages/common/page_nav.jsp" %>

</div>

<%--静态包含页脚内容--%>
<%@include file="/pages/common/footer.jsp" %>

</body>
</html>