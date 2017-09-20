<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>test</title>
	<!-- Bootstrap -->

	<script src="../js/jquery.min.js"></script>

</head>

<body>
<script type="text/javascript">
	function send() {
		var content = $("#content").val();
		content = encodeURI(content);
		var chk_value = [];
		$("input[name='uid']:checked").each(function () {
			chk_value.push($(this).val())
		});
		var chec = chk_value.toString();
		chec = encodeURI(chec);

		var jinji;
		$("input[name='payMethod']:checked").each(function () {
			jinji=($(this).val())
		});

		$.ajax({
			type: "get",
			url: "/user/insert.action",//需要用来处理ajax请求的action
			data: {content: content, chec: chec, jinji:jinji},
			dataType: "json",//设置需要返回的数据类型
			success: function (data) {
				/* if(data != null)
				 {
					 alert("成功");
				 }*/
				var count = data.count;
				if (count == 1) {
					alert("注册成功")
					$(":checkbox").removeAttr("checked");
					$("#content").val("");
					$(":radio").removeAttr("checked");
				}
			},
			error: function () {
				alert("系统异常，请稍后重试！");
			}
		});
	}

</script>
<form action="/user/insert.action" method="post">
	请选择联系人：

	<c:forEach items="${list}" var="li">
		<input type="checkbox" value="${li.uid}" name="uid" id="name">${li.uname}
	</c:forEach>
	<br>
	请输入消息内容:<textarea name="content" id="content" cols="30" rows="10"></textarea>
	<%--    请输入消息内容：<input type="text" name="content" id="content"><br>--%>
	<input type="radio" name="payMethod" value="1" />爱理不理
	<input type="radio" name="payMethod" value="2" />看一下就好
	<input type="radio" name="payMethod" value="3" />十万火急
	<br>
	<br>
	<br>
	<input type="button" value="发送" onclick="send()" id="send()">
	<a href="/user/selectAll.action"><input type="button" value="查看站内信息"/></a>
</form>
</body>
</html>