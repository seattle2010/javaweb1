<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/1
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
你的页面出错了

<%
    String msg = exception.getMessage();
%>
出现信息： <%=msg%>
</body>
</html>
