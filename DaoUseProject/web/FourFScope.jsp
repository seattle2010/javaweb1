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
<%--%>--%>
<%--通过getAttribute方法获取对应作用域中的值--%>
pageContext---> <%=pageContext.getAttribute("msg")%> <br>
request ---> <%=request.getAttribute("msg")%>   <br>
session ---> <%=session.getAttribute("msg")%>    <br>
application ---> <%=application.getAttribute("msg")%>   <br>
<%--通过pageContext里面的findAttribute方法来获取--%>
<%=pageContext.findAttribute("msg") %>
<br>
<%--jsp的EL表达式--%>
<%--基本格式  ${变量名}--%>
${msg}
pageScope requestScope sessionScope applicationScope都是EL的内置对象
${pageScope.msg}    一样效果<%=pageContext.getAttribute("msg")%> <br>
${requestScope.msg}  一样效果 <%=request.getAttribute("msg")%>   <br>
${sessionScope.msg}  一样效果<%=session.getAttribute("msg")%>    <br>
${applicationScope.msg}  一样效果 <%=application.getAttribute("msg")%>   <br>

${4/2}
${1 == 1}
${1 eq 1}
</body>
</html>

