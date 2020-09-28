<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/24
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
i.<c:set />
    作用：set标签可以往域中保存数据
    域对象.setAttribute(key,value);
    scope 属性设置保存到哪个域
       page 表示PageContext 域 （默认值） page
       request 表示Request 域 request
       session 表示Session 域
       application 表示ServletContext 域
    var 属性设置key 是多少
    value 属性设置值
--%>

保存之前：${ sessionScope.abc } <br>
<c:set scope="session" var="abc" value="abcValue"/>
保存之后：${ sessionScope.abc } <br>

保存之前：${ requestScope.def } <br>
<c:set scope="request" var="def" value="defValue"/>
保存之后：${ requestScope.def } <br>

<%--
    ii.<c:if />
      if 标签用来做if 判断。
      test 属性表示判断的条件 （使用EL 表达式输出）
--%>
<c:if test="${ 12 == 12 }">
    <h1>12 等于12</h1>
</c:if>

<c:if test="${ 12 != 12 }">
    <h1>12 不等于12</h1>
</c:if>

<%--
iii.<c:choose> <c:when> <c:otherwise>标签
作用：多路判断。跟switch ... case .... default 非常接近
choose 标签开始选择判断
when 标签表示每一种判断情况
test 属性表示当前这种判断情况的值
otherwise 标签表示剩下的情况
<c:choose> <c:when> <c:otherwise>标签使用时需要注意的点：
     1、标签里不能使用html注释，要使用jsp 注释
     2、when 标签的父标签一定要是choose 标签
--%>
<%
    request.setAttribute("height", 155);
%>
<c:choose>
    <%-- 这是JSP注释 --%>
    <c:when test="${ requestScope.height > 190 }">
        <h2>小巨人</h2>
    </c:when>
    <c:when test="${ requestScope.height > 180 }">
        <h2>很高</h2>
    </c:when>
    <c:when test="${ requestScope.height > 170 }">
        <h2>还可以</h2>
    </c:when>
    <c:otherwise>
        <c:choose>
            <c:when test="${requestScope.height > 160}">
                <h3>大于160</h3>
            </c:when>
            <c:when test="${requestScope.height > 150}">
                <h3>大于150</h3>
            </c:when>
            <c:when test="${requestScope.height > 140}">
                <h3>大于140</h3>
            </c:when>
            <c:otherwise>
                其他小于140
            </c:otherwise>
        </c:choose>
    </c:otherwise>
</c:choose>
</body>
</html>
