<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/17
  Time: 3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="button" id="btn1" value="读取文件">
<script>
    var btnId = document.getElementById("btn1");
    btnId.onclick = function () {
        var httpRequest = new XMLHttpRequest();
//        alert(httpRequest.readyState);
        httpRequest.open("GET", "abc.txt", true);

        httpRequest.send();
//        alert(httpRequest.readyState);
        httpRequest.onreadystatechange = function () {
//            alert(httpRequest.readyState);
            if(httpRequest.readyState == 4){
                if(httpRequest.status == 200){
                    alert("success");
                    alert(httpRequest.responseText);
                }else {
                    alert("fail");
                }
                }
        }
    }

</script>
</body>
</html>
