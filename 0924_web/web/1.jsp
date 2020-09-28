<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/26
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<String> list = (List<String>) request.getAttribute("users"); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <%
        for (int i = 0; i < list.size(); i++) {
    %>
        <tr>
        <td><%=list.get(i)%></td>
        </tr>092
    <%
        }
    %>
</table>
</body>
</html>
