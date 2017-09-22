<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/17
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="../../jquery-3.2.1.min.js"></script>
<html>
<head>
    <title>Title</title>
    <script src="../../jquery-3.2.1.min.js"></script>
</head>
<body>
<select  id="provinceId">
    option value="-1">请选择</option>
</select>省 <select id="cityId">
    option value="-1">请选择</option>
</select>市


</body>
<script>
	$.get("/LinkByJSONServlet", {}, function (data) {
		$.each(data, function (index, item) {
			console.info(arguments);
			$("#provinceId").append("<option value='+item.id+'>" + item.name + "</option>");

		})
	}, "json");
</script>
</html>
