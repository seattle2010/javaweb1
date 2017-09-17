<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/17
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="button" id="btn1" value="获取系统时间">
<span id="showTime"></span> <br>

<%=new java.util.Date().toLocaleString()%>
</body>
<script src="_01SystemTimeAjax.js"></script>
</html>
