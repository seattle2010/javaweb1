<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/17
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <script src="ajaxCheck.js"></script>
</head>
<body>
<h3>失去焦点后 检查用户名是否存在</h3>
用户名 : <input type="text" id="username" style="background-color: orange"> <span id="msg" style="background-color: pink"></span>
</body>
<script>
    document.getElementById("username").onblur = function () {
//        alert("1");
        var usernameText = this.value;
//        alert(usernameText);  //输入框里输入tom

        //创建ajax对象
        var ajax = new XMLHttpRequest();
        //2创建http请求 设置请求方式 url 是否异步
        ajax.open("get", "/CheckUserServlet?username=" + usernameText, true);

        ajax.onreadystatechange = function () {
            if(ajax.readyState == 4 && ajax.status == 200){
                document.getElementById("msg").innerHTML = ajax.responseText;
            }
        }
        ajax.send();
    }
</script>
</html>
