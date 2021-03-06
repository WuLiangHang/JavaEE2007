<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/24
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
request.getScheme() 它可以获取请求的协议
request.getServerName() 获取请求的服务器ip 或域名
request.getServerPort() 获取请求的服务器端口号
request.getContextPath() 获取当前工程路径
request.getMethod() 获取请求的方式 （GET 或POST）
request.getRemoteHost()  获取客户端的ip地址
session.getId() 获取会话的唯一标识
--%>

<% request.setAttribute("req", request); %>
<%--<%=request.getScheme()%>它可以获取请求的协议<br/>--%>
<%--<%=request.getServerName()%> 获取请求的服务器ip 或域名<br/>--%>
<%--<%=request.getServerPort()%> 获取请求的服务器端口号<br/>--%>
<%--<%=request.getContextPath()%> 获取当前工程路径<br/>--%>
<%--<%=request.getMethod()%> 获取请求的方式 （GET 或POST）<br/>--%>
<%--<%=request.getRemoteHost()%>  获取客户端的ip地址<br/>--%>
<%--<%=session.getId()%> 获取会话的唯一标识<br/>--%>
1.协议： ${ req.scheme }<br>
2.服务器ip：${ pageContext.request.serverName }<br>
3.服务器端口：${ pageContext.request.serverPort }<br>
4.获取工程路径：${ pageContext.request.contextPath }<br>
5.获取请求方法：${ pageContext.request.method }<br>
6.获取客户端ip 地址：${ pageContext.request.remoteHost }<br>
7.获取会话的id 编号：${ pageContext.session.id }<br>
</body>
</html>
