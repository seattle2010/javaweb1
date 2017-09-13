
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>货品显示列表</title>
</head>
<body>
List
${products}
<a href="/ProductServlet?cmd=add">添加货品</a>
<table border="1" cellspacing="0" cellpadding="0" width=100%>
    <tr>
        <th>货品编号</th>
        <th>货品名称</th>
        <th>货品品牌</th>
        <th>货品分类</th>
        <th>供&nbsp应&nbsp商</th>
        <th>零&nbsp售&nbsp价</th>
        <th>成&nbsp本&nbsp价</th>
        <th>折&emsp;&emsp;扣</th>
        <th>操&emsp;&emsp;作</th>
    </tr>
    <c:forEach var="p" items="${products}">
    <tr>
        <td>${p.id}</td>
        <td>${p.productName}</td>
        <td>${p.brand}</td>
        <td>${p.dir_id}</td>
        <td>${p.supplier}</td>
        <td>${p.salePrice}</td>
        <td>${p.costPrice}</td>
        <td>${p.cutoff}</td>
        <td>
            <a href="#">编辑</a>
            <a href="#">删除</a>
        </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
