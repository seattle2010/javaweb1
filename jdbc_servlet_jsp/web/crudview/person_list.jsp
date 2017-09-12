
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${stu}
<hr>
<a href="/AddStudent1Servlet">添加</a>
<table border="1"cellpadding="0" cellspacing="0" width=60%>
    <tr style="background-color: antiquewhite">
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>edit</th>
    </tr>
    <c:forEach var="s" items="${stu}" varStatus="vs">
        <%--${vs.count % 2 == 0?"orange":""}--%>
    <tr style="background-color: ${vs.count % 2 == 0?"orange":""}">
        <td>${s.id}</td>
        <td>${s.name}</td>
        <td>${s.age}</td>
        <td>
            <a href="/DeleteStudent1Servlet?id=${s.id}">删除</a>
            <a href="/EditStudent1Servlet?id=${s.id}">编辑</a>
        </td>
    </tr>
    </c:forEach>

</table>
</body>
</html>
