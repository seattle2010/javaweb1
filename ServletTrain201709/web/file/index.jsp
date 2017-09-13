<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/1
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>jsp</title>
  </head>
  <body>
jsp
<%=new java.util.Date().toLocaleString()%>
<!-- html注释 -->
  <%-- jsp的注释--%>
  <%
      //java代码
      String name = "tom";
      boolean boo = true;
  %>
  <%--输出--%>
<%=name%>
  <%--成元变量  成员方法  注意  ！！！！ 有叹号--%>
  <%!
      private String username;
      public void dowork(){}
  %>

  <%
      int num = 5;
      if(num>5){
      %>
输出大于5
<%
      }else{
  %>
  输出小于5
  <%}%>
  </body>
</html>
