<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/24
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<%
    request.setAttribute("key", "值");
%>
表达式脚本输出key 的值是：
<%=request.getAttribute("key") == null ? "" : request.getAttribute("key")%><br/>
<%--<%=request.getAttribute("key1")%><br/>--%>
EL 表达式输出key 的值是：${key1}
</body>
</html>
