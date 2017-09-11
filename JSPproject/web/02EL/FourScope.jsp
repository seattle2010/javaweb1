<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/11
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp四大作用域</title>
</head>
<body>
<%
    //jsp四大作用域
    pageContext.setAttribute("msg","pageContext");
    request.setAttribute("msg","request");
    session.setAttribute("msg","session");
    application.setAttribute("msg","application");
%>
<h3>获取每一个作用域中的数据</h3>
pageContext--><%=pageContext.getAttribute("msg") %>  <br>
request--><%=request.getAttribute("msg")%>  <br>
session--><%=session.getAttribute("msg")%>  <br>
application--><%=application.getAttribute("msg")%>  <br>

<h3>pageContext的findAttribute方法  从小到大自动查找 只有pageContext有这个方法</h3>
<%=pageContext.findAttribute("msg")%>
<h3>由此引出EL</h3>
${msg}
</body>
</html>
