<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/14
  Time: 3:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="#" method="post">
    <table border="1" cellpadding="0" cellspacing="0">
        <tr>
            <td>货品分类</td>
            <td><input type="text" name="productName" required></td>
        </tr>
        <tr>
            <td>货品品牌</td>
            <td><input type="text" name="brand"></td>
        </tr>
        <tr>
            <td>供应商</td>
            <td><input type="text" name="supplier"></td>
        </tr>
        <tr>
            <td>零售价</td>
            <td><input type="number" name="salePrice" min="0"></td>
        </tr>
        <tr>
            <td>成本价</td>
            <td><input type="number" name="costPrice" min="0"></td>
        </tr>
        <tr>
            <td>折扣</td>
            <td><input type="number" name="cutoff" min="0" max="1"></td>
        </tr>
        <tr>
            <td>货品分类</td>
            <td>
                <option value="A"></option>
                <option value="B"></option>
                <option value="C"></option>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="保存"></td>
        </tr>
    </table>
</form>
</body>
</html>
