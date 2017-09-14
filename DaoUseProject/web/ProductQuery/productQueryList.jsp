
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>货品显示列表</title>
</head>
<body>
Query
<%--${products}--%>
<form action="/ProductSimpleServlet" method="post">
    商品的名称: <input type="text" name="productName" value="${query.productName}" style="width: 100px"> <br>
    商品零售价: 低价格<input type="number" name="minSalePrice" value="${query.minSalePrice}" style="width: 120px">
    - 高价格<input type="number" name="maxSalePrice" value="query.maxSalePrice"> <br>
    <input type="submit" value="查询" style="background-color: orange" width=100px>
</form>
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
    </tr>
    </c:forEach>
</table>
</body>
</html>
