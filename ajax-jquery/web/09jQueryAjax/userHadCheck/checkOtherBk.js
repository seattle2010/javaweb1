$(function () {

	$("#username").blur(function () {
		alert($);
		var usernameText = $(this).val();
		console.info(usernameText);
		var params = {username: usernameText};
		$.get("/UserCheckServlet",params, function (data) {

			$("#msg").text(data).css("color","red");
		});
	});

//		$("#username").click(function () {
//			$.get("/userHadCheckServlet", {"username": "usernameText"}, function (date) {
//				alert(date);//GetDate.ashx返回当前时间
//			});
//		})
});