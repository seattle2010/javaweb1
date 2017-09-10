<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/10
  Time: 8:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
EL jsp页面
<h3>Person对象的信息</h3>
${p}
<br>username:${p.username}
<br>username:${p["username"]}
<br>username:${p.getUsername()}

<br> age:${p.age}
<br> hobbys:${p.hobbys[0]}
<br> list:${p.hobbyList[1]}
<br> map:${p.map}
<%--打印出对应key的value--%>
<br> map:${p.map.company}
<br> map:${p.map["www.baidu.com"]}

<%--上面  获取对象中的属性:
req.setAttribute("p", person对象);
方式一:使用.:${p.username}
方式二:使用[]:${p["username"]}
--------------------------------------
我们建议使用方式1,此时就得属性名起一个有意义的英文单词或单词短语.
因为JavaBean和Map很类似.
${p.username},中的username也可以使用Map中key的名字.--%>

<%--EL的主要作用是获取共享数据 其他作用是：--%>
<%--获取上下文路径： --%>
${pageContext.request.contextPath}
<%--可以做运算 ： --%>
${4/2}
<%--判断共享数据是否为空 ：   --%>
<%
    pageContext.setAttribute("list", null);
%>
<%--如果为空返回为true--%>
${empty list}
<%--做比较 判断值相等  地址相等--%>
${1==1}
${1 eq 1}

<%
    pageContext.setAttribute("date",new java.util.Date());
%>
北京时间: ${date}
</body>
</html>
