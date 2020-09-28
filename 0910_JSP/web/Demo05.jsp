<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/10
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--if语句--%>
<%
    int sex = 1;
    if (sex == 0) {
%>
<h1>男性</h1>
<% } else { %>
<h1> 女性 </h1>
<%
    }
%>
<%--for循环语句--%>
<table border="1" cellspacing="0">
    <%
        for (int i = 1; i <= 10; i++) {
    %>
    <tr>
        <td>
            第<%=i%>行
        </td>
    </tr>
    <% } %>
</table>
<% String username = request.getParameter("username");
    System.out.println("用户性的请求参数值是:" + username);%>
</body>
</html>
