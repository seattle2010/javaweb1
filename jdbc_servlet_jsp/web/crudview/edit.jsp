<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/13
  Time: 1:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${stuedit}
<form action="EditSaveServlet" method="post">
    <input type="hidden" name="id" value="${stuedit.id}">
    姓名: <input type="text" name="name" value="${stuedit.name}" required> <br>
    年龄: <input type="text" name="age" value="${stuedit.age}" required> <br>
    <input type="submit" value="保存编辑信息" name="save">
</form>

</body>
</html>
