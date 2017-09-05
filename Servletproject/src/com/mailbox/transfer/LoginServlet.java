package com.mailbox.transfer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/param/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //System.out.println("login");
        String username = request.getParameter("username");
        out.println("欢迎"+username+ "<br>");
        //out.println("<a href='/param/ListServlet'>收件箱</a>");
        out.println("<a href='/param/ListServlet?username="+username+"'>收件箱</a>");

    }

}
