<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/9
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>四大作用域</title>
</head>
<body>
//jsp四大作用域  引出EL表达式
<%
//    pageContext.setAttribute("msg","pageContextValue");
    request.setAttribute("msg","requestValue");
    session.setAttribute("msg","sessionValue");//session 的值不会变化，因为网页没有关 拷贝地址 关闭浏览器 再打开粘贴能
    application.setAttribute("msg","applicationValue");//application一直不会变
%>
<h3>获取出每一个作用域中的数据</h3>
pageContext ：<%=pageContext.getAttribute("msg")%>  <br>
request ：<%=request.getAttribute("msg")%>  <br>
session ：<%=session.getAttribute("msg")%>   <br>
application ：<%=application.getAttribute("msg")%>   <br>
<hr>
<h3>pageContext的findAttribute方法</h3>
<%--上面的一个一个逐个注销  看下面效果--%>
<%=pageContext.findAttribute("msg")%>  <br>
<%--下面可以不写出，为了让用户能看懂null 用不显示的方式  三目判断--%>
<%--<%=pageContext.findAttribute("msg") == null?"":pageContext.findAttribute("msg") %>--%>
<%--!!!!!!!!!由此引出EL表达式  以上效果都可以用下面的${}来表示--%>
        <%--作用就是  从作用域中获取共享数据--%>
${msg} <br>

<%--EL里面有内置对象--%>
<%--1. param--%>
<%--意思就是获取变量名称为username的变量的值--%>
           <%--可以在地址后面加get参数演示  ？username="tom"--%>
<%--http://localhost:8080/scope.jsp?username=%22tom%22--%>
username =  ${param.username}

<%--上面作用域拷贝下来--%>

<h3>使用EL获取不同作用域中的属性值</h3>
<%--page相当于是pageContext的servlet实现对象--%>
   <%--下面的写完后  !!!可以注销上面四行 中的任何一个   可以各自注销一下 证明只是在所在的作用域里取值，如果没值 就不显示--%>
pageContext:  ${pageScope.msg} <br>
request: ${requestScope.msg} <br>
session:${sessionScope.msg} <br>
application:${applicationScope.msg} <br>
</body>
</html>
