<%--
  Created by IntelliJ IDEA.
  User: shi
  Date: 2017/9/14
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${p1}
<form action="/PersonEditServlet" method="post">
    <input type="hidden" name="id" value="${p1.id}">
    用户名:<input type="text" name="name" value="${p1.name}" required> <br>
    年龄:<input type="text" name="age" value="${p1.age}" required> <br>
    <input type="submit" value="修改信息">
</form>
</body>
</html>
