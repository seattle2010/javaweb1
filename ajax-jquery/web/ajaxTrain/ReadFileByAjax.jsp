
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
Asynchronous javascript and xml
异步的javascript和xml技术  简称ajax 阿贾克斯
主要技术: js  XMLHTTPRequest

<input type="button" value="读取文件" id="btn1">
<script>
	document.getElementById("btn1").onclick =function () {
//		创建XMLHttpRequest对象 这种创建只针对chrome firefox,Opera浏览器
//		如果使用IE浏览器,需要另外一套创建方式,一般做法在这里做浏览器判断
		var ajax = new XMLHttpRequest();
//		1使用什么提交方式 get,post两种方式
//		2 传递给哪一个servlet或者jsp做响应,也就是获得目标地址的值
//		3 是否使用异步技术  true 使用  false 不使用  默认是true 使用
		ajax.open("get", abcd.txt, true);
		ajax.send();
		ajax.onreadystatechange = function () {
			alert(ajax.responseText);
		}
	}
</script>
</body>
</html>
