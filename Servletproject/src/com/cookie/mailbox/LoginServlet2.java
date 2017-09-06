package com.cookie.mailbox;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet2", urlPatterns = "/cookie/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
        //1 创建cookie对象
        //       Cookie cookie =new Cookie(String name,String value)  "currentname"  "will"
        //        2 把cookie放入响应中，响应给浏览器，把共享数据存储在浏览器中
        //response.addCookie(cookie);
        //3获取cookie以及其中的数据
        //因为cookie存在于请求头中 ，应该在请求头中获取
        String username = request.getParameter("username");
        Cookie cookie = new Cookie("currentname", username);
        //解决cookie的中文问题
        //Cookie cookie = new Cookie("currentname", URLEncoder.encode(username,"UTF-8"));
        response.addCookie(cookie);
        //==============================================

        out.println("欢迎"+username+ "<br>");
        //out.println("<a href='/param/ListServlet'>收件箱</a>");
        out.println("<a href='/cookie/ListServlet2'>收件箱</a>");
    }

}
