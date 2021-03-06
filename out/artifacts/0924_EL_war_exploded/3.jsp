<%@ page import="com.entity.Person" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/9/24
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    Person person = new Person();
    person.setName("我好帅！");
    person.setPhones(new String[]{"18610541354", "18688886666", "18699998888"});
    List<String> cities = new ArrayList<String>();
    cities.add("北京");
    cities.add("上海");
    cities.add("深圳");
    person.setCities(cities);
    Map<String, Object> map = new HashMap<>();
    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");
    person.setMap(map);
    person.setAge(15);
    pageContext.setAttribute("p", person);
%>
<body>
输出Person：${ p }<br/>
输出Person 的name 属性：${p.name} <br>
输出Person 的phones 数组属性值：${p.phones} <br>
输出Person 的phones 数组属性值：${p.phones[2]} <br>
输出Person 的cities 集合中的元素值：${p.cities} <br>
输出Person 的List 集合中个别元素值：${p.cities[2]} <br>
输出Person 的Map 集合: ${p.map} <br>
输出Person 的Map 集合中某个key 的值: ${p.map.key3} <br>
输出Person 的age 属性：${p.age} <br>
</body>
</html>
