
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


    // ajax("/_01SystemTimeAjax.jsp",function (str) {
    //     document.getElementById("showTime").innerHTML = str;
    // })
}