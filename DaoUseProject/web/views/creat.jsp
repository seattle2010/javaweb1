<%--
  Created by IntelliJ IDEA.
  User: shi
  Date: 2017/9/13
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/PersonSaveServlet" method="post">
    姓名: <input type="text" name="name" required> <br>
    年龄: <input type="text" name="age" required> <br>
    <input type="submit" value="保存信息">
</form>

</body>
</html>
