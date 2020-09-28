<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/10
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    private Integer id;
    private String name;
    private static Map<String, Object> map;
%>

<%--2.声明static静态代码块--%>
<%! static {
    map = new HashMap<String, Object>();
    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");
}%>
<%=123%><br>
<%=123.123%><br>
<%="我是一个字符串"%><br>
<%=map%>
</body>
</html>
