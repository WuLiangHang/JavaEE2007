<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/14
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String message = (String) request.getAttribute("message");%>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <title>话费自助缴存系统</title>
</head>
<body>
<% if (message != null) {%>
<h3><%=message%>
</h3>
<% }%>
<table align="center" border="1px solid black">
    <tr align="center">
        <td>话费自助缴存系统</td>
    </tr>
    <form action="SearchServlet" method="post">
        <tr align="center">
            <td>电话号码:<input name="phoneNum" type="text"/></td>
        </tr>
        <tr align="center">
            <td>
                <input type="submit" value="查询"/>
            </td>
        </tr>
    </form>

</table>
</body>
</html>