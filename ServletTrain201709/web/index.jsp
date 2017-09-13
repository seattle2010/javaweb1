<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  jsp页面
<%--  jsp需要导入的jar包: jsp-api.jar
                      EL.jar
                      jstl.jar
                      stand.jar
  jsp  java server page  java的服务网页 Java的动态网页
  jsp也是servlet   !!!!!!!!
  servlet的强项是控制跳转,也可以网页输出
  jsp的强项是网页输出,
  jsp是在网页中写java代码--%>

  <%
//      定义局部变量
      int a = 2;
      String str = "tom";
  %>
  <%--=a 相当于System.out.println(a);--%>
  <%=a      %>
  <%!
//      定义全局变量
     private String str1;
     public void work(){ };
  %>
<%--int num = 20;
  if(num>30){
  打印num大于30
  }else{
  打印num小于30
  }--%>
  <% int num = 20;%>
  <%
      if(num>30){
  %>
  num大于30
  <% }else{ %>
  num小于30
  <% } %>

  </body>
</html>
