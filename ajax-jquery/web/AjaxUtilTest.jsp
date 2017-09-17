<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/17
  Time: 3:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--用网址 http://localhost:8080/AjaxUtilTest.jsp  验证--%>
    <title>Title</title>
    <script src="AjaxUtil.js"></script>
</head>
<body>
<script>
    ajax("abc.txt",function (str) {
        alert(str);
    },function () {
        alert("文件不存在");
    })
</script>
</body>
</html>
