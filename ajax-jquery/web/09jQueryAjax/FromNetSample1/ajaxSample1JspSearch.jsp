<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<%--JSP查询--%>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>test</title>
	<script src="../js/jquery.min.js"></script>
	<script type="text/javascript">
		$(function () {
			$("#selectOne").blur(function(){
				var content=$(this).val();
				/*var rr=$("option[name='aa']:checked").val();*/
				content=encodeURI(content);

				alert(content);
				if(content!=null) {
					$.ajax({
						type: "get",
						url: "/user/selectOne.action",//需要用来处理ajax请求的action
						data: {content: content},
						dataType: "json",//设置需要返回的数据类型
						success: function (data) {
							var list = data.list;
							if (list != null) {
								alert("成功")
								var str = "";
								for (var i = 0; i < list.length; i++) {
									str += "<tr id=" + list[i].mid + ">" +
										"<td>" + "<input type='checkbox' name='ids' value='" + list[i].mid + "' id='ch'>" + "</td>" +
										"<td class='mi'>" + list[i].mid + "</td>" +
										"<td>" + list[i].content + "</td>" +
										"<td>" + list[i].cretetime + "</td>" +
										"<td>" + list[i].rank + "</td>" +
										"<td>" + list[i].u_id + "</td>" +


										"<td>" + "<input type='button' value='删除' onclick='shan(" + list[i].mid + ")' class='sh'>" + "</td>" +
										"</tr>";
								}

								$("#tbody").html(str);
							}
						},
						error: function () {
							alert("系统异常，请稍后重试！");
						}
					});
				}else{
					alert("bu neng wei kong")
				}

			})
			$("#deleteAll").click(function(){
				var array=new Array();
				$("input[type=checkbox]:gt(0):checked").each(function(){
					array.push($(this).parent().next().text());
				});
				console.log(array);
				location.href="/user/batchDelete.action?ids="+array;
			});
			$("#selectAll").click(function(){
				$("input[type=checkbox]:gt(0)").each(function () {
					if ($(this).prop("checked")) {
						$(this).removeAttr("checked");
					} else {
						$(this).prop("checked", 'true');
					}
				});

			});
			$(".cha").change(function(){
				var pp=$(this).val();
				/!* var pp=$("option[name='aa']:checked").val();*!/
				pp=encodeURI(pp);
				var op=pp.toString();
				$.ajax({
					type: "get",
					url: "/user/selectByName.action",//需要用来处理ajax请求的action
					data: {op: op},
					dataType: "json",//设置需要返回的数据类型
					success: function (data) {
						var list = data.list;

						if (list!= null) {
							alert("成功")
							var str = "";
							for (var i = 0; i < list.length; i++) {
								str += "<tr id=" + list[i].mid + ">" +
									"<td>" + "<input type='checkbox' name='ids' value='" + list[i].mid + "' id='ch'>" + "</td>" +
									"<td class='mi'>" + list[i].mid + "</td>" +
									"<td>" + list[i].content + "</td>" +
									"<td>" + list[i].cretetime + "</td>" +
									"<td>" + list[i].rank + "</td>" +
									"<td>" + list[i].u_id + "</td>"+


									"<td>" + "<input type='button' value='删除' onclick='shan(" + list[i].mid + ")' class='sh'>" + "</td>" +
									"</tr>";
							}
							$("#tbody").html(str);
						}
					},
					error: function () {
						alert("系统异常，请稍后重试！");
					}
				});

			})

		})
		function shan(mid) {
			$.ajax({
				type: "get",
				url: "/user/delete.action",//需要用来处理ajax请求的action
				data: "mid=" + mid,
				dataType: "json",//设置需要返回的数据类型
				success: function (data) {
					var count = data.count;
					if (count == 1) {
						$("#" + mid).remove();
					}
				},
				error: function () {
					alert("系统异常，请稍后重试！");
				}
			});

		}

	</script>
</head>

<body>



<select  name="u_id"  class="cha">
	<option value="syyh" name="aa">所有用户</option>
	<c:forEach items="${list }" var="Type">
		<option value="${Type.uid }" name="aa">${Type.uname }</option>

	</c:forEach>
</select>
你可以用来模糊查询:<input type="text" id="selectOne" />
<table border="1" width="400" border="0" cellspacing="0" cellpadding="0" id="ta">
	<tr>
		<td><input type="checkbox" id="selectAll" /></td>
		<td>消息Id</td>
		<td>消息内容</td>
		<td>时间</td>
		<td>紧急程度</td>
		<td>接收人</td>
		<td>操作</td>
	</tr>
	<tbody id="tbody">
	<c:forEach items="${list2}" var="li">
		<tr id="5"></tr>
		<tr id="${li.mid}">
			<td><input type="checkbox"/></td>
			<td class="mi">${li.mid}</td>
			<td>${li.content}</td>
			<td>${li.cretetime}</td>
			<td>${li.rank}

				<c:if test="${li.rank==101}">爱理不理</c:if>
				<c:if test="${li.rank==202}">看一下就好</c:if>
				<c:if test="${li.rank==303}">十万火急</c:if>

			</td>
			<td>
				<c:if test="${li.u_id==1}">唐太宗</c:if>
				<c:if test="${li.u_id==2}">汉武帝</c:if>
				<c:if test="${li.u_id==3}">秦始皇</c:if>
				<c:if test="${li.u_id==4}">成吉思汗</c:if>
				<c:if test="${li.u_id==5}">武则天</c:if>


			</td>
			<td>
				<input type="button" value="删除" onclick="shan(${li.mid})" class="sh">
			</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
<input type="button" value="批量删除" id="deleteAll"/>

</body>
</html>
