
//全选/全不选
function checkAll(checked) {
	// $(":input[name= hobby]").prop("checked",checked);
	$(":input[name= hobby]").attr("checked",checked);
}


//反选
function checkUnAll() {
	$(":input[name=hobby]").prop("checked",function (index,value) {
		// 在html画面随便选中几个checkbox 再点击反选按钮  看控制台
		console.info(arguments);
		return !value;
	})
}

$(function(){
    $("#checkAll").click(function () {
	    checkAll(this.checked);
    })
})
//全选  全不选  复选框
/*
alert($);
//全选/全不选
function checkAll(checked) {
	var hobbys = document.getElementsByName("hobby");
	for(var ele in hobbys){
		// console.debug(hobbys[ele]);
		hobbys[ele].checked = checked;
	}

}
//反选
function checkUnAll() {
	var hobbys = document.getElementsByName("hobby");
	for(var ele in hobbys){
		// console.debug(hobbys[ele]);
		hobbys[ele].checked = !hobbys[ele].checked;
	}
}
//全选  全不选  复选框
document.getElementById("checkAll").onclick = function () {
	checkAll(this.checked);//当前对象的check属性
}*/
