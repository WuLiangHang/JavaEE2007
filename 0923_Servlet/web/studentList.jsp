<%@ page import="com.entity.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/23
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<Student> list = (List<Student>) request.getAttribute("studentList"); %>
<html>
<head>
    <title>学生列表</title>
</head>
<body>
<table border="1px">
    <thead>
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>电话</td>
    </tr>
    </thead>
    <tbody>
    <% for (int i = 0; i < list.size(); i++) {
    %>
    <tr>
        <td><%=list.get(i).getId()%>
        </td>
        <td><%=list.get(i).getName()%>
        </td>
        <td><%=list.get(i).getAge()%>
        </td>
        <td><%=list.get(i).getPhone()%>
        </td>
    </tr>
    <%
        } %>
    </tbody>
</table>
</body>
</html>
