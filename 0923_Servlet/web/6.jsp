<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/23
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=i%>
<% out.write("out输出1");%>
<% out.write("out输出2");%>
<% response.getWriter().write("response输出1");%>
<% response.getWriter().write("response输出2");%>
</body>
</html>
