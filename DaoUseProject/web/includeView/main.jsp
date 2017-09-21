
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%--静态包含--%>
<%--特点: 三个jsp页面的代码单纯拼接,
不做删除改动,是完整的三个网页代码的拼接--%>
<%--特点2:编译后的.class文件是一个,不是三个--%>
<%--适合范围:如果三个页面之间没有数据交互,可以选用这种方式--%>
<%--显示的是三个jsp页面的拼接效果--%>
<%--<%@include file="head.jsp"%>--%>
<%--<%@include file="head1.jsp"%>--%>
<%--This a main page 这是jsp主体页面--%>
<%--<%@include file="foot.jsp"%>--%>
<%--<%@include file="head1.jsp"%>--%>

动态包含
特点1 分别编译三个jsp,形成三个不同的.class文件
2 在服务器运行中,动态的组合,形成包含,每一个相对独立
3 动态包含和静态包含的显示效果是一模一样的
4 动态包含能够互相传递数据,
如果需要别的jsp页面的数据,就使用动态包含

<jsp:include page="head.jsp">
    <jsp:param name="name" value="tom"></jsp:param>
</jsp:include>
This a main page 这是jsp主体页面
<jsp:include page="foot.jsp">
    <jsp:param name="age" value="12"></jsp:param>
</jsp:include>

</body>
</html>
