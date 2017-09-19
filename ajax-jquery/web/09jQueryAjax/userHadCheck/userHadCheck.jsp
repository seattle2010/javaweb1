<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/17
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript"  src="../../jquery-1.10.2.min.js"></script>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>失去焦点后 检查用户名是否存在</h3>
用户名 : <input type="text" id="username" class="username" style="background-color: orange"> <span id="msg" style="background-color: pink"></span>
</body>
<script>

	$(function () {

//	$("#username").blur(function () {
//		alert($);
//		var usernameText = this.val();
//		var params = {"username": usernameText};
//		$.get("/userHadCheckServlet",params, function (data) {
//			$("#msg").text(data);
//		});
//	});

//		$("#username").click(function () {
//			$.get("/userHadCheckServlet", {"username": "usernameText"}, function (date) {
//				alert(date);//GetDate.ashx返回当前时间
//			});
//		})
	});



/*//	document.getElementById("username").onblur = function (this) {
    document.getElementById("username").onblur = function () {
//        alert("1");
        var usernameText = this.value;
//        alert(usernameText);  //输入框里输入tom

        //创建ajax对象
        var ajax = new XMLHttpRequest();
        //2创建http请求 设置请求方式 url 是否异步
        ajax.open("get", "/userHadCheckServlet?username=" + usernameText, true);

        ajax.onreadystatechange = function () {
            if(ajax.readyState == 4 && ajax.status == 200){
                document.getElementById("msg").innerHTML = ajax.responseText;
            }
        }
        ajax.send();
    }*/
</script>
</html>
