$(function() {
// String DOM jQuery
	$("#test_append").click(function() {
		// append(content) 向每个匹配的元素内部追加内容。
		// $("#div1").append($("#b1"));

		$("div").append($("#b1"));
	});

	$("#test_appendTo").click(function() {
		// appendTo 把所有匹配的元素追加到另一个指定的元素集合中。和上面相反
		$("#b1").appendTo($("#div1"));
	});

	$("#test_prepend").click(function() {
		// prepend 向每个匹配的元素内部前置内容。
		$("#div2").prepend($("#b1"));
	});

	$("#test_prependTo").click(function() {
		// 把所有匹配的元素前置到另一个、指定的元素集合中。
		$("#b1").prependTo($("#div2"));
	});
});
// ------------------------------------------
$(function() {
	$("#test_after").click(function() {
		// 在每个匹配的元素之后插入内容。 哥哥.after(弟弟)
		$("#div1").after($("#b1"));
	});

	$("#test_before").click(function() {
		// 在每个匹配的元素之前插入内容。

	});
	$("#test_insertAfter").click(function() {
		// 把所有匹配的元素插入到另一个、指定的元素集合的后面。
		// 小弟.insertAfter(大哥)
		$("#b1").insertAfter($("#div1"));
	});
	$("#test_insertBefore").click(function() {
		// 把所有匹配的元素插入到另一个、指定的元素集合的前面。
		

	});
});

$(function() {
//删除节点
	$("#test_removeNode").click(function() {
		// var copy = $("#btn").remove();
		// copy.insertAfter($("ul"));
		var copy = $("#btn").detach();
		copy.insertAfter($("ul"));
	});
	//删除子节点
	$("#test_emptyNode").click(function() {
		$("ul").empty();
	});

});
$(function () {

	$("#btn").click(function () {
		alert("1");
	});
});


$(function() {

	$("#btn_clone").click(function() {
		alert("点击了我...");
	});
//绿色克隆
	$("#test_clone").click(function() {
		// 克隆匹配的DOM元素并且选中这些克隆的副本。
		//不带事件
		var copy =$("#btn_clone").clone();//
		//如果带true参数 则带事件 传递
		var copy = $("#btn_clone").clone(true);
		$(copy).insertAfter($("ul"));
		
	});

	$("#test_replaceWith").click(function() {
		// replaceWith将所有匹配的元素替换成指定的HTML或DOM元素。
		$(":button").replaceWith("<b>SB</b>");
	});

	$("#test_replaceAll").click(function() {
		// replaceAll用匹配的元素替换掉所有 selector匹配到的元素。
$("<b>SB</b>").replaceAll($(":button"));
	});

});
//属性操作
$(function() {
//获取属性值
	$("#test_getterAttr").click(function() {
		// jquery凡是取值的方法,如果是多个元素,那么只会取第一个元素的值.
		console.info($("#div1").attr("name"));
		console.info($("#div1").attr("style"));
	});
//设置属性值
	$("#test_setterAttr").click(function() {
		// jquery凡是设置值的方法,都是对所有元素操作.并且返回值都为操作jquery对象
		$("#div1").attr("name","div3");
		console.info($("#div1").attr("name"));

});
});
//添加css
$(function() {
	$("#test_addClass").click(function() {
		// 为每个匹配的元素添加指定的类名。注意不要加"."
		$(":button").addClass("other");
	});
//删除css
	$("#test_removeClass").click(function() {
		// 为每个匹配的元素添加指定的类名。注意不要加"."
		$(":button").removeClass("other");

	});
//轮换css
	$("#test_toggleClass").click(function() {
		// 如果存在（不存在）就删除（添加）一个类。
		$(":button").toggleClass("other");

	});

	$("#test_hasClass").click(function() {
		// hasClass 判断是否存在该Css 查询时候只能获取第一个
		console.info($(":button").hasClass("other"));
	});
});