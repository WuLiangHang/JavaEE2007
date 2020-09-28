<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/24
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取值</title>
</head>
<body>
输出请求参数username 的值：${ param.username } <br>
输出请求参数password 的值：${ param.password } <br>

输出请求参数username 的值：${ paramValues.username[1] } <br>
输出请求参数hobby 的值：${ paramValues.hobby[0] } <br>
输出请求参数hobby 的值：${ paramValues.hobby[1] } <br>

输出请求头 【User-Agent】的值：${ header['User-Agent'] } <br>
输出请求头 【Connection】的值：${ header.Connection } <br>
输出请求头 【User-Agent】的值：${ headerValues['User-Agent'][0] } <br>

获取Cookie 的名称：${ cookie.JSESSIONID.name } <br>
获取Cookie 的值：${ cookie.JSESSIONID.value } <br>

输出&lt;Context-param&gt;username 的值：${ initParam.username } <br>
输出&lt;Context-param&gt;url 的值：${ initParam.url } <br>
</body>
</html>
