<%--
&lt;%&ndash;
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/9
  Time: 15:25
  To change this template use File | Settings | File Templates.
&ndash;%&gt;
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>注册</h3>
<!--必须是post方式    enctype="multipart/form-data"是变成二进制编码方式-->
<form action="/FileUploadServlet" method="post" enctype="multipart/form-data">
    账号： <input type="text" name="username"> <br>
    邮箱： <input type="text" name="email"> <br>
    <!--accept="image/*"是只能选择图片类型结尾的文件 /是转义字符-->
    &lt;%&ndash;头像： <input type="file" name="headImg" accept="image/*"/> <br>&ndash;%&gt;
    头像： <input type="file" name="headImg" /> <br>
    <button value="注册提交">注册</button>

</form>
</body>
</html>
--%>
