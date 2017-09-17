$(function () {
	console.info($("#username").length);
	console.info($("li").length);

	console.info($("#username").val());//get
	console.info($("#username").val("jack"));//set
	console.info($("#username").val());

	console.info($("#h1").html());
	console.info($("#h1").text());
//attr   标签里属性设定  key --> value
	$("#h1").attr("style", "color:orange");
	$("#h1").css("background-color", "yellow");
	console.info($("#h1").attr("style"));
	// console.info(#(""))
	// console.info(#(""))
	// console.info(#(""))
	// console.info(#(""))

})