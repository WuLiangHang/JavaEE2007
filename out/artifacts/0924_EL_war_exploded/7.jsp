<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/24
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("key2", "pageContext2");
    request.setAttribute("key3", "request");
    session.setAttribute("key4", "session");
    application.setAttribute("key5", "application");
%>
${ pageScope.key2 }
${ requestScope.key3 }
${ sessionScope.key4 }
${ applicationScope.key5 }
</body>
</html>
