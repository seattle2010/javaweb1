<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>js中的Ajax经典示例</title>

    <script src="https://cdn.bootcss.com/jquery/2.2.0/jquery.js"></script>
    <script type="text/javascript">


        function ajax() {

            //先声明一个异步请求对象
            var xmlHttpReg = null;
            if (window.ActiveXObject) {//如果是IE

                xmlHttpReg = new ActiveXObject("Microsoft.XMLHTTP");

            } else if (window.XMLHttpRequest) {

                xmlHttpReg = new XMLHttpRequest(); //实例化一个xmlHttpReg
            }

            //如果实例化成功,就调用open()方法,就开始准备向服务器发送请求
            if (xmlHttpReg != null) {
                xmlHttpReg.open("get", "About.aspx", true);
                xmlHttpReg.send(null);
                xmlHttpReg.onreadystatechange = doResult; //设置回调函数

            }

            //回调函数
            //一旦readyState的值改变,将会调用这个函数,readyState=4表示完成相应

            //设定函数doResult()
            function doResult() {

                if (xmlHttpReg.readyState == 4) {//4代表执行完成


                    if (xmlHttpReg.status == 200) {//200代表执行成功
                        //将xmlHttpReg.responseText的值赋给ID为resText的元素
                        document.getElementById("resText").innerHTML = xmlHttpReg.responseText;


                    }
                }

            }


        }
    </script>
</head>
<body>
<div id="resText"></div>
<form method=get action="">
    <input type="button" value="小胡子"  onclick="ajax();"/>
</form>
</body>
</html>
