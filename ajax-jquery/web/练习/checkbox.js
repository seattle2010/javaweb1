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
}