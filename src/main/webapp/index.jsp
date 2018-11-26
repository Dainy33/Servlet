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
<a href="<%=ContextPath%>/first" >First</a>
<a href="<%=ContextPath%>/get?name=dainy33&value=surprise" >Get</a>
<form action="<%=ContextPath%>/get" method="post">
    <label>
        <input type="text" name="name"  required="required"/>
    </label>
    <label>
        <input type="text" name="value" required="required"/>
    </label>
    <input type="submit" name="submit" value="提交">
</form>
</body>
</html>
