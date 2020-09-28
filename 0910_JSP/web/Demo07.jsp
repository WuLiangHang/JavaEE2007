<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/10
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>99乘法表</h1>
<% for (int i = 1; i < 10; i++) {
    for (int j = 1; j <= i; j++) {
%>
<%--<%=j%> * <%=i%> = <%=i * j%> &nbsp;--%>
<%=j + "*" + i + "=" + (i * j)%>&nbsp;
<%
    }
%><br/><%
    } %>
</body>
</html>
