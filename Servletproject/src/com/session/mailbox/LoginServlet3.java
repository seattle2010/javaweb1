package com.session.mailbox;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet3", urlPatterns = "/session/LoginServlet3")
public class LoginServlet3 extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
        String username = request.getParameter("username");
        //1 创建和获取session对象
        HttpSession session = request.getSession();
        //2 往session里存储数据   String name   Object value
        //区别  不需要放到响应中去  底层会自动放入
        session.setAttribute("currentname",username);

        //==============================================

        out.println("欢迎"+username+ "<br>");
        //out.println("<a href='/param/ListServlet'>收件箱</a>");
        out.println("<a href='/session/ListServlet3'>收件箱</a>");
    }

}
