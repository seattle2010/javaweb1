<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--jsp的四大作用域--%>
<%
    pageContext.setAttribute("msg","this is pageContext");
    request.setAttribute("msg","this is request");
    session.setAttribute("msg","this is session");
    application.setAttribute("msg","this is application");
%>
<%--通过getAttribute方法获取对应作用域中的值--%>
pageContext---> <%=pageContext.getAttribute("msg")%>
request ---> <%=request.getAttribute("msg")%>
session ---> <%=session.getAttribute("msg")%>
application ---> <%=application.getAttribute("msg")%>
</body>
</html>
