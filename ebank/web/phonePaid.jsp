<%@ page import="com.ebank.entity.Phone" %><%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/14
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Phone phone = (Phone) request.getAttribute("phone"); %>
<html>
<head>
    <title>话费自助缴存系统</title>
</head>
<body>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>话费自助缴存系统</title>
</head>
<body>
<table align="center" border="1px solid black">
    <tr align="center">
        <td>话费自助缴存系统</td>
    </tr>
    <tr align="center">
        <td>电话号码:<%= phone.getPhoneNum()%>
        </td>
    </tr>
    <tr align="center">
        <td>
            您已经缴纳了本月话费。<a href="search.jsp">返回首页</a>
        </td>
    </tr>
</table>
</body>
</html>
</body>
</html>
