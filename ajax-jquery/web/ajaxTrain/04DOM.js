$(function() {
// String DOM jQuery
	$("#test_append").click(function() {
		// append(content) 向每个匹配的元素内部追加内容。

	});

	$("#test_appendTo").click(function() {
		// appendTo 把所有匹配的元素追加到另一个指定的元素元素集合中。和上面相反

	});

	$("#test_prepend").click(function() {
		// prepend 向每个匹配的元素内部前置内容。

	});

	$("#test_prependTo").click(function() {
		// 把所有匹配的元素前置到另一个、指定的元素元素集合中。
	});

});
// ------------------------------------------
$(function() {
	$("#test_after").click(function() {
		// 在每个匹配的元素之后插入内容。 哥哥.after(弟弟)

	});

	$("#test_before").click(function() {
		// 在每个匹配的元素之前插入内容。

	});
	$("#test_insertAfter").click(function() {
		// 把所有匹配的元素插入到另一个、指定的元素元素集合的后面。小弟.insertAfter(大哥)

	});
	$("#test_insertBefore").click(function() {
		// 把所有匹配的元素插入到另一个、指定的元素元素集合的前面。
		

	});
});

$(function() {
//删除节点
	$("#test_removeNode").click(function() {
		/**
		 * 从DOM中删除所有匹配的元素。 这个方法不会把匹配的元素从jQuery对象中删除，因而可以在将来再使用这些匹配的元素。
		 * 但除了这个元素本身得以保留之外，其他的比如绑定的事件，附加的数据等都会被移除。
		 */
		//临时删除 会有一个副本被保存 可以var copy = $("#btn").remove();
		  //不保留元素带的事件

	});
	//删除子节点
	$("#test_emptyNode").click(function() {


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
// var copy = $("#btn_clone").clone();
var copy = $("#btn_clone").clone(true);
$(copy).insertAfter($("ul"));
		
	});

	$("#test_replaceWith").click(function() {
		// replaceWith将所有匹配的元素替换成指定的HTML或DOM元素。

	});

	$("#test_replaceAll").click(function() {
		// replaceAll用匹配的元素替换掉所有 selector匹配到的元素。

	});

});
//属性操作
$(function() {
//获取属性值
	$("#test_getterAttr").click(function() {
		// jquery凡是取值的方法,如果是多个元素,那么只会取第一个元素的值.

	});
//设置属性值
	$("#test_setterAttr").click(function() {
		// jquery凡是设置值的方法,都是对所有元素操作.并且返回值都为操作jquery对象

	});
});
//添加css
$(function() {
	$("#test_addClass").click(function() {
		// 为每个匹配的元素添加指定的类名。注意不要加"."

	});

//删除css
	$("#test_removeClass").click(function() {
		// 为每个匹配的元素添加指定的类名。注意不要加"."

	});
//轮换css
	$("#test_toggleClass").click(function() {
		// 如果存在（不存在）就删除（添加）一个类。


	});

	$("#test_hasClass").click(function() {
		// hasClass 判断是否存在该Css 查询时候只能获取第一个


	});
});