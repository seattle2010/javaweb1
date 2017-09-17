<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/16
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--ajax 的全称是Asynchronous(异步) JavaScript and XML--%>
    <%--在不刷新页面的情况下从服务器获取，提交数据的一种数据交互方式;--%>
</head>
<body>
<%--<input type="text" id="input1" onblur= doCheck(this)> <span id="span1"></span>--%>

<form action="/regist.jsp" method="post">
    用户id: <input type="text" name="productName" onblur="doCheck(this.value)"> <span id="msg"></span> <br>
    密&nbsp;&nbsp;码: <input type="password" name="password" id="password"> <br>
    <input type="submit" value="注册提交">
</form>

<script>
    function doCheck(productName) {

        if(input1.value.length != 0){
//            创建ajax核心对象
            var xmlHttpReg = new XMLHttpRequest();

//            var url = "user_check.jsp?userId="+field.value+"&times="+new Date().getTime();
//            var url = "../ajax/shop_type_status.php?id="+type_id+"&time="+Math.random();
//            var url = "ajaxShow.jsp";
            var url = "/CheckServlet?productName=" + productName;
            //设置请求方式为get 请求的url 为异步提交
            //如果实例化成功,就调用open()方法,就开始准备向服务器发送请求
            xmlHttpReg.open("post",url,true)
            xmlHttpReg.send(null);
            //将方法地址复制给onreadystatechange属性 通过匿名函数判断获得
            //回调函数
            //一旦readyState的值改变,将会调用这个函数,readyState=4表示完成相应

            //设定函数doResult()
            xmlHttpReg.onreadystatechange = doResult(); //设置回调函数

            //将设置信息发送给ajax引擎


            function doResult() {

                if (xmlHttpReg.readyState == 4) {//4代表执行完成


                    if (xmlHttpReg.status == 200) {//200代表执行成功
                        //将xmlHttpReg.responseText的值赋给ID为resText的元素
                        alert(xmlHttpReg.responseXML);
                        document.getElementById("password").innerHTML = xmlHttpReg.responseText;
                        document.getElementById('password').value = id;
                    }
                }

            }

            function XXX() {
                if(xmlHttp.readyState == 4 && xmlHttp.status == 200){
                    alert(xmlHttp.responseText);
                    if(xmlHttp.responseText == "true"){
                        document.getElementById("msg").innerHTML = "<font color='orange'>" + "用户名已经存在"+xmlHttp.responseText;
                    }else {
                        document.getElementById("msg").innerHTML = "此用户名可以注册";
                    }

                }else {
                    alert("请求失败 错误代码" + xmlHttp.status);
                }
            }
        }
    }
</script>

</body>
</html>
