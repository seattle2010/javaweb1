<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/10
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/student/SaveStudentServlet" method="post">
    <input type="hidden" name="id" value="${student.id}">
    姓名: <input type="text" name="name" required value="${student.name}"> <br>
    年龄: <input type="text" name="age" required value="${student.age}"><br>

    <button name="submit" value="保存学生信息">保存学生信息</button>
    <%--<button name="submit" value="${student == null?"保存学生信息":"更新学生信息"}">${student == null?"保存学生信息":"更新学生信息"}</button>--%>
</form>
</body>
</html>
