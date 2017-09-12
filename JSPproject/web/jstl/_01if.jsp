<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/10
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>jstl 最主要的是核心标签库 core  首先要导入两个包，然后用taglib引入标签库</title>
</head>
<body>
常用jstl标签
<%--条件判断 <c:if>--%>
<%pageContext.setAttribute("num",20);%>
<%--语法1  满足条件就输出 标签中的内容  双标签--%>
<c:if test="${num > 10}">
    num > 20
</c:if>

<%--语法2 把判断结果存储在一个变量中 单标签--%>
把结果放入到var里面  同时放到scope指定作用域里
<c:if test="${num > 20}" var="result" scope="page"/>
${result}

<%--choose标签--%>
<c:choose>
    <c:when test="${num>20}">num大于20</c:when>
    <c:when test="${num<20}">num小于20</c:when>
    <c:otherwise>num等于20</c:otherwise>
</c:choose>
</body>

</html>
