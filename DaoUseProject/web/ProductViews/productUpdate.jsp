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
<form action="/ProductServlet?cmd=update" method="post">
    <table border="1" cellpadding="0" cellspacing="0">
        <tr>
            <td>货品分类</td>
            <td><input type="text" name="productName" required></td>
        </tr>
        <tr>
            <td>货品品牌</td>
            <td><input type="text" name="brand" required></td>
        </tr>
        <tr>
            <td>供应商</td>
            <td><input type="text" name="supplier" required></td>
        </tr>
        <tr>
            <td>零售价</td>
            <td><input type="number" name="salePrice" min="0" required></td>
        </tr>
        <tr>
            <td>成本价</td>
            <td><input type="number" name="costPrice" min="0" required></td>
        </tr>
        <tr>
            <td>折扣</td>
            <td><input type="text" name="cutoff" required></td>
        </tr>
        <tr>
            <td>货品分类</td>
            <td>
                <select name="dir_id">
                    <option value="1">鼠标</option>
                    <option value="2">无线鼠标</option>
                    <option value="3">有线鼠标</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="更新保存"></td>
        </tr>
    </table>
</form>
</body>
</html>
