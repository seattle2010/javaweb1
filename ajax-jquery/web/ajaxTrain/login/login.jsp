<%--
  Created by IntelliJ IDEA.
  User: shi
  Date: 2017/9/18
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="../../jquery-3.2.1.min.js"></script>

<html>
<head>
	<title>Title</title>
</head>
<body>

用户名: <input type="text"  id="username">
密码 : <input type="text"  id="password">
<input type="button" value="登录注册" id="btn1">
</body>
<script>

document.getElementById("btn1").onclick = function () {
	var usernameText = document.getElementById("username").value;
	var passwordText = document.getElementById("password").value;

	var ajax = new XMLHttpRequest();
	ajax.open("post", "/LoginServletBK", true);
	//让username和password形成键值对的形式传入过去
	ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	ajax.send("username=" + usernameText + "&password=" + passwordText);

	ajax.onreadystatechange = function () {
		if(ajax.readyState == 4 && ajax.status == 200){
			window.location.href = "/index.jsp";
		}
	}

}
</script>
<script>
	$.ajax()
	$.post()
	$.get()
</script>
</html>
