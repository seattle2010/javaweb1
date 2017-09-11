<%@ page import="templateJDBCTemplate.domain.Person" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/11
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
学生列表
<%--<%=request.getAttribute("persons")%>--%>
<%
    List<Person> persons = (List<Person>)request.getAttribute("persons");
%>
<table border="1" cellspacing="0" cellpadding="0" width=50%>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
    </tr>
    <tr>
        <td>1</td>
        <td>2</td>
        <td>3</td>
    </tr>
    <%
        for(Person ele:persons){
    %>
    <tr>
        <td><%=ele.getId()%></td>
        <td><%=ele.getName()%></td>
        <td><%=ele.getAge()%></td>
    </tr>
    <% } %>
</table>

</body>
</html>
