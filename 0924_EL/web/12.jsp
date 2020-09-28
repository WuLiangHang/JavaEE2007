<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/24
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<% request.setAttribute("score", 155); %>
<body>
<c:choose>
    <c:when test="${ requestScope.score >= 90 &&  requestScope.score <= 100}">
        <h2>优秀</h2>
    </c:when>
    <c:when test="${ requestScope.score >= 80 &&  requestScope.score <= 89}">
        <h2>良好</h2>
    </c:when>
    <c:when test="${ requestScope.score >= 70 &&  requestScope.score <= 79}">
        <h2>中等</h2>
    </c:when>
    <c:when test="${ requestScope.score >= 60 &&  requestScope.score <= 69}">
        <h2>及格</h2>
    </c:when>
    <c:when test="${ requestScope.score >= 0 &&  requestScope.score <= 59}">
        <h2>不及格</h2>
    </c:when>
    <c:otherwise>
        <h2>传入的分数范围不合法！</h2>
    </c:otherwise>
</c:choose>
</body>
</html>
