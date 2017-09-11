<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/11
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>EL的内置对象</h3>
<%--可以在网址后面加上 ?username="tom"   --%>
${param.username}

<%
    //jsp四大作用域
    pageContext.setAttribute("msg","pageContext");
    request.setAttribute("msg","request");
    session.setAttribute("msg","session");
    application.setAttribute("msg","application");
%>
<h3>使用EL获取不同作用域中的属性值</h3>
pageContext-->${pageScope.msg}
request-->${requestScope.msg}
session-->${sessionScope.msg}
application-->${applicationScope.msg}
</body>
</html>
