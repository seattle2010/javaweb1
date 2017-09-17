$(function(){
	// 所有子孙
	console.info($("ul li"));
	//儿子
	console.info($("ul>li"));

	console.info($("#myul li"));
	// label后面所有的兄弟 不包括label的儿子
	console.info($("label~input"));
	//label后面紧跟着的所有input兄弟
	console.info($("label+input"));

})