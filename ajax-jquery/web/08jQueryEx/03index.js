$(function(){
    // 1  所有的里面的第一个
	$("ul li:first").css("background-color", "orange");
	//2 所有里每一个ul的第一个子元素
	$("ul li:first-child").css("background-color", "pink");
	//3
	$("ul li:last").css("background-color", "red");
	//4
	$("ul li:last-child").css("background-color", "yellow");
	//5 (:odd/:even)
	// $("#mytable tbody").css("background-color", "pink");
	// $("#mytable tbody tr").css("background-color", "pink");
	$("#mytable tbody tr:even").css("background-color", "pink");
	//6
	$("ul li:odd").css("background-color", "green")
	//7   2   2n偶数  2n+1 奇数 3n 3的倍数   n可以等于0
	$("ul li:nth-child(2n)").css("background-color", "orange");
	//8 $("input[name!='newletter']")
	// $("input[name^='new']")  异或等 就相当于以什么什么开头的
	// $("input[name$='new']")  以什么什么结尾的
	//$("input[name*='new']")  包含这个字母的
	console.info($(":checkbox[id^='select_']"));
})