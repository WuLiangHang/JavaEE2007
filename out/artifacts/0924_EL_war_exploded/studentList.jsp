<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/24
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<% List<Student> list = (List<Student>) request.getAttribute("studentList"); %>--%>
<html>
<head>
    <title>学生列表</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>电话</td>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${requestScope.studentList}" var="stu">
        <tr>
            <td>${stu.id}
            </td>
            <td>${stu.name}
            </td>
            <td>${stu.age}
            </td>
            <td>${stu.phone}
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
