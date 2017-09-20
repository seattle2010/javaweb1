$(function () {

	$("#username").blur(function () {
		// alert($);
		var usernameText = $(this).val();
		var params = {username: usernameText};
		$.get("/userHadCheckServlet",params, function (data) {

			$("#msg").text(data);
		});
	});

//		$("#username").click(function () {
//			$.get("/userHadCheckServlet", {"username": "usernameText"}, function (date) {
//				alert(date);//GetDate.ashx返回当前时间
//			});
//		})
});