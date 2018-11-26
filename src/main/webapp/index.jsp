<%--
  Created by IntelliJ IDEA.
  User: dainy33
  Date: 11/26/18
  Time: 1:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
    <% String ContextPath = request.getContextPath(); %>
</head>
<body>
<h1>Hello World!</h1>
<a href="<%=ContextPath%>/first">First</a>
<a href="<%=ContextPath%>/get?name=dainy33&value=surprise">Get</a>
<form action="<%=ContextPath%>/get" method="post">
    <input type="text" name="name" required="required"/>
    <input type="text" name="value" required="required"/>
    <input type="submit" name="submit" value="提交">
</form>
<form action="<%=ContextPath%>/CheckBox" method="POST" target="_blank">
    <input type="checkbox" name="runoob" checked="checked"/> 菜鸟教程
    <input type="checkbox" name="google"/> Google
    <input type="checkbox" name="taobao" checked="checked"/> 淘宝
    <input type="submit" value="选择站点"/>
</form>
<form action="<%=ContextPath%>/ReadParams" method="POST" target="_blank">
    <input type="checkbox" name="maths" checked="checked"/> 数学
    <input type="checkbox" name="physics"/> 物理
    <input type="checkbox" name="chemistry" checked="checked"/> 化学
    <input type="submit" value="选择学科"/>
</form>
</body>
</html>
