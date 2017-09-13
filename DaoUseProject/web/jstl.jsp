
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
<%--java standed tag liberary--%>
<%--循环控制 if--%>
<% pageContext.setAttribute("num",21);%>
<c:if test="${num > 20}">
    num > 20 dog
</c:if>
<%--方式2--%>
<br>
<%--可以将结果放入var某个scope作用域内--%>
<c:if test="${num > 20}" var="result" scope="page">
    结果是: num > 20 <br>
    ${result}
</c:if>  <br>
<%--多条件控制--%>  <%--选择标签--%>
<c:choose>
    <c:when test="${num > 20}">num 大于20</c:when>
    <c:when test="${num < 20}">num 小于20</c:when>
    <c:otherwise>num 等于20</c:otherwise>
</c:choose>

<%--for(int i = 1;i<=10;i++)--%>
<br>
<c:forEach var="num" begin="1" end="10" step="1">
    ${num}  <br>
</c:forEach>

<% pageContext.setAttribute("list", java.util.Arrays.asList("A","B","C","D"));%>
<c:forEach items="${list}" var="ele">
    ${ele}
</c:forEach>
</body>
</html>
