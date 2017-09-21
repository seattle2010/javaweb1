<%--
  Created by IntelliJ IDEA.
  User: shi
  Date: 2017/9/18
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
用户名 : <input type="text" id="username" required style="background-color: orange"> <span id="msg" style="background-color: lightpink"></span>
</body>
<script>
	                      //当鼠标移出输出框时候触发事件
	document.getElementById("username").onblur= function () {
		var inputText = this.value;
		//创建ajax对象
		var ajax = new XMLHttpRequest();
		//引入open方法
		var url = "/UserCheckServlet?username="+inputText;
		ajax.open("get",url);
		ajax.onreadystatechange = function () {
			if(ajax.readyState == 4 && ajax.status == 200){
			document.getElementById("msg").innerHTML = ajax.responseText
			}else {
			document.getElementById("msg").innerHTML = "验证中";
			}
		}
		ajax.send();
	}
</script>
</html>
