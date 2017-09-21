
document.getElementById("btn1").onclick = function () {
    var httpRequest = new XMLHttpRequest();
//        alert(httpRequest.readyState);
//     httpRequest.open("GET", "/_01SystemTimeAjax.jsp?"+new Date().getTime(), true);
    httpRequest.open("GET", "/_01SystemTimeAjaxServlet?"+new Date().getTime(), true);


//        alert(httpRequest.readyState);
    httpRequest.onreadystatechange = function () {
//            alert(httpRequest.readyState);
        if(httpRequest.readyState == 4){
            if(httpRequest.status == 200){
                // alert("success");
                // alert(httpRequest.responseText);
                document.getElementById("showTime").innerHTML = httpRequest.responseText
            }else {
                document.getElementById("showTime").innerHTML = "系统加载中"
            }
        }
    }

    httpRequest.send();
    //
    // jQuery对ajax进行了更好优化封装,可以直接调用jQuery中的对应方法,实现ajax功能
    //     //方式1   最传统
    //     $.load(XX,YY,ZZ)
    //     //方式2 简单好用,常用  用于验证是否已经存在用户等查询情况
    //     $.get(url,params,"json") //"json"可以是xml等其他类型
    //     //方式3  简单好用,常用  用于提交表单,登录验证等 post传值方式
    //     $.post(url,params,"json")//"json"可以是xml等其他类型
    //     //方式4  设置参数最多,最复杂的方式
    //     $.ajax(XX,YY,ZZ,AA,BB,CC)
    //     //方式5  最新的
    //     $.fetch(XX,YY,ZZ)
    // ------------>额外的
    //     相当于java的foreach
    // $.each()
    
    // ajax("/_01SystemTimeAjax.jsp",function (str) {
    //     document.getElementById("showTime").innerHTML = str;
    // })
}