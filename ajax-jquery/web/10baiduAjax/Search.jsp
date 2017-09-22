<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/23
  Time: 2:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="../jquery-3.2.1.min.js"></script>
<html>
<head>
	<title>Title</title>
</head>
<body>
<div>
	<h1>种子搜索</h1>
	<div>
		<input type="text" name="input1" id="input1"><input type="submit" value="种子一下">
	</div>
	<div id="div1" style="border: 1px solid pink;width: 170px; position: relative;left: -34px"></div>
</div>
</body>
<script>
//	$(function () {
		//文本框keyup的时候发送ajax
//		$("#input1").change = function () {
		document.getElementById("input1").onkeyup = function () {

			var SearchText = this.value;
//						alert(SearchText);
//			if (SearchText != null && SearchText != "") {
				var ajax = new XMLHttpRequest();
				ajax.open("get", "/SearchAjaxServlet", true);
				ajax.onreadystatechange = function () {
					if (ajax.readyState == 400 && ajax.status == 200) {
						//inputText是数组
						alert(ajax.responseText);
//						var inputTextArray = ajax.responseText.split(",");
//						alert(inputTextArray);
//						for (var i = 0; i < inputTextArray.length; i++) {
//							$("#div1").append("<div>" + inputTextArray[i] + "</div>");
//						}
//						//将div显示
//						$("#div1").show();
					}
				}
				ajax.send();
//			}
		}
//	});
</script>
</html>
