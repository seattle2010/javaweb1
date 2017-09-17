<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/9/17
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
json
<%--json表示一个对象--%>
单独运行json要加圆括号  ({name:"tom",age:17})
<%--!!!!!json字符串 网络传输String str = "{name:"tom",age:17}"  --%>
<script>

    var obj = new Object(); //    js对象
    //json是花括号表示一个对象 []表示一个数组
    var employee = {
        id : 1234,
        name : "tom",
        age : 18,
        dept : {    //一个对象中有多个数据
            did:10,
            dname : "开发部"
        },   //一个数据中有多个值 类似数组
        hobby : ["java","c","js"]

    };
    console.info(employee);
    //访问对象里的数据
    console.info(employee.name);
    console.info(employee.dept);
    console.info(employee.dept.dname);
    console.info(employee.hobby);
    console.info(employee.hobby[2]);

//json表示多个对象
//    List<Map<Sting,Object>>
    var emps = [employee,employee,employee]
    console.info(emps)

//    String str = "{name:"tom",age:17}"
    var str = "{name:'tom',age:17}";
//    var json = eval(str);
    var json = eval("("+str+")");
    console.info(json);
</script>
</body>
</html>
