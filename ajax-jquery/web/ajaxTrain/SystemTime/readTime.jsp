<%--
  Created by IntelliJ IDEA.
  User: shi
  Date: 2017/9/18
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
当前系统时间 : <span id="span1"></span> <br>
<input type="button" value="显示当前系统时间" id="btn1"> <br>
<br>
<%=new java.util.Date().toLocaleString()%>
</body>

	<script src="readTime.js"></script>

</html>
