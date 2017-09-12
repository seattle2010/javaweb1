<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/10
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${students} <br>
<hr>

<table border="1" width="80%" cellpadding="0" cellspacing="0">
<tr style="background-color: orange">
    <th>ID</th>
    <th>name</th>
    <th>age</th>
</tr>
<c:forEach var="s" items="${students}" varStatus="vs">
    ${s}  <br>
<tr style="background-color:${vs.count%2 == 0?"pink":""} ;">
    <td>${s.id}</td>
    <td>${s.age}</td>
    <td>${s.name}</td>

</tr>
</c:forEach>
</table>
</body>
</html>
