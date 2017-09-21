
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>货品显示列表</title>
</head>
<body>
List
<%--${products}--%>

<form action="/QueryResultServlet" method="post" >
    商品名称--><input type="text" name="productName"> <br>
价格范围 最小价格: <input type="text" name="minSalePrice">-
    最大价格:<input type="text" name="maxSalePrice"> <br>
    <input type="submit" name="submit" value="查询" style="background-color: orange">
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
