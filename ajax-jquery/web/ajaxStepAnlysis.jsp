<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/17
  Time: 3:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<<head>
    <meta charset="UTF-8">
    <title>ajax</title>
    <script>

        //网络数据请求工具 ，数据类型一般有：(json|xml)
        //如何拿：创建对象+配置方法open+send请求发送给服务器
        //监听数据状态， onreadystatechange 判断状态，服务器默认get请求|若用POST请求出错500，请求方式由服务器来定，




        //一:创建Ajax对象
        // 1.1定义变量，用来保存创建出的对象，(XMLHttpRequest);
        var xhr;
        //1.2：根据浏览器支持标准。创建对象。
        //判断当前浏览器是否具备XMLHttpRequest
        if(window.XMLHttpRequest){
            xhr = new XMLHttpRequest();
        }else{
            //IE5|6|7 使用ActiveXobject创建
            //Ajax组件放在ActiveXObject组件库中，需传入'Miscrosoft.XMLHTTTP'才能返回Ajax组件
            xhr = new ActiveXObject('Microsoft.XMLHTTP');
        }
        //二：配置Ajax请求地址
        // ======================post请求=====================================
        //配置请求信息
        //open三个参数()
        //1:设置请求方式get|post
        //2:设置请求数据的接口地址
        //3:设置请求是否是异步请求(异步请求:请求发送后，不等待请求数据，先执行其他任务，当数据达到本地在处理) 默认是：true为异步
        // xhr.open('post','index.html',true);

        // post请求参数问题，把post请求所需的参数，放到send()中
        // 若其参数有中文字符，将其转码为unicode并拼接如下
        // xhr.send('user=lemon&password=23');
        // xhr.send('user='+encodeURI('中文')+'password=23');

        //POST请求参数中有中文，都要使用encodeURI进行转码
        //POST参数放置问题  需要将参数丢掷send中
        //GET参数send参数为null send() 为了所有服务器能正确识别，传值为null

        //===========================get请求=============================
        //若有参数拼接到url中，多个数据之间使用&&连接
        //缓存规避
        //get请求中：若每次请求为同一个接口，浏览器将从缓存中取数据，而不是服务器；如果服务器中接口数据内容改变，则就拿不到新数据。
        所以在请求接口后拼接一个随机数参数，这样浏览器每次拿到接口在缓存中都找不到这个接口对应数据，这样就会从服务器中读取数据，
                        而服务器端并没有开设接收随机数参数的字段，所以get发送过来的随机数将被服务器丢弃，只能返回处理的接口数据；

        //         xhr.open('get','myX.ML.xml'+Math.random(),true);
        xhr.open('get','myJSON.json',true);
        //三：发送数据
        xhr.send(null);//严谨写法null

        //四:监听数据传输情况
        //如何判断数据有没有到达：
        //readySate值改变执行，
        xhr.onreadystatechange = function(){
            if(xhr.readyState==4&&xhr.status==200){
                //只有当readyState的值是4且status值是200，服务器数据才算发送到本地
                //数据请求成功
                //若数据是xml格式，数据返回保存到responseXML属性中，否则responseText;
                //请求数据是xml传输的时候，responseText把这些数据转化为字符串，但responseXML会把这些数据当成xml文档对象，再解析成字符串更方便；
                //若数据请求为json格式，respinseText会把数据转换成json字符串,responseXML并不会受到这些数据为null

                console.log(xhr.responseText);//json  收
                console.log(xhr.responseXML);//xml 收
            }
        }
    </script>
</head>
<body>

</body>
</html>
