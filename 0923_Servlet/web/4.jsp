<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/23
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h1 style="color: gold">九九乘法表</h1>
    <table>
        <%
            for (int i = 1; i < 10; i++) {
        %>
        <tr>
            <%
                for (int j = 1; j <= i; j++) {
            %>
            <td style="border: 1px black solid">
                <%=j%> * <%=i%> = <%=(i * j)%> &nbsp;
            </td>
            <%
                }
            %>
        </tr>
        <%
            }
        %>
    </table>
</div>


</body>
</html>
