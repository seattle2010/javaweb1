<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/10
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>for each  首先要先引入标签库</title>
</head>
<body>
<%--需求 从1输出到10--%>
<%--for(int i = 1;i<10;i++)--%>
<c:forEach var="num" begin="1" end="10" step="1">
    ${num}
</c:forEach>
<%--增强型foreach--%>
<%
    pageContext.setAttribute("list",java.util.Arrays.asList("A","B","c","D"));
%>
<%--foreache(List ele:list)--%>
   <%--注意  别忘了有花括号 {}--%>
<c:forEach items="${list}" var="ele">
    ${ele} <br>
</c:forEach>

</body>
</html>
