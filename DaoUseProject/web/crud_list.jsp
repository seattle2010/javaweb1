<%@ page import="java.util.List" %>
<%@ page import="templateJDBCTemplate.domain.Person" %><%--
  Created by IntelliJ IDEA.
  User: shi
  Date: 2017/9/12
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--crud_list.jsp--%>
<%
//    获取person对象
    List<Person> personList = (List<Person>)request.getAttribute("personList");
%>
${personList}
<table border="1" cellpadding="0" cellspacing="0" width="50%">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
    </tr>
    <% for(Person ele:personList) {  %>
    <tr>
        <td><%=ele.getId()%></td>
        <td><%=ele.getName()%></td>
        <td><%=ele.getAge()%></td>
    </tr>
    <% } %>
</table>

</body>
</html>
