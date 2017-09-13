
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--core是jsp的标准核心标签库 fmt是格式化库 jstl依赖core核心库--%>
<%--jsp有很多库--%>
<%--国际化库--%>
<%--sql库--%>
<%--常用的就是core核心库,--%>
<html>
<head>
    <title>teacher</title>
</head>
<body>
${t}
t是自己定义个名称 在servlet里已经set进去对象,在这里直接取
对象的属性 用点.+字段名  能够直接取到
name:${t.name}
age:${t.age}
<hr>
hobbys:  <br>
       ${t.hobbys[0]} <br>
       ${t.hobbys[1]} <br>
       ${t.hobbys[2]} <br>
<hr>
list:      <br>
     ${t.list[0]} <br>
     ${t.list[1]} <br>
     ${t.list[2]} <br>
<% pageContext.setAttribute("date",new java.util.Date());%>
<br>
${date}
<br>
<fmt:formatDate value="${date}" pattern="yyyy-MM-dd HH-mm-ss"/>

</body>
</html>
