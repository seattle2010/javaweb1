<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <style>
        table{
            text-align: center;
            margin:0 auto;
            border-collapse: collapse;
        }
        tr:nth-child(odd){
            background: rgba(128,128,128,.3);
        }

        tr:hover{
            background: rgba(128,128,128,.6);
        }
        tr:first-child{
            background: #0088cc;
            color: #fff;
        }

    </style>
</head>
<body>
${person}
<br>
<hr>
<a href="/Person1AddServlet">增加</a> <br>
<table width=60% border="1" cellspacing="0" cellpadding="0">
    <caption>人员信息表</caption>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>操作</th>
    </tr>
    <c:forEach var="s" items="${person}" varStatus="vs">
        <tr style="background-color: ${vs.count%2==0?"orange":""}">
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.age}</td>
            <td>

                <a href="/Person1DeleteServlet?id=${s.id}">删除</a>
                <a href="#">编辑</a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>