package com.session.mailbox;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ListServlet3", urlPatterns = "/session/ListServlet3")
public class ListServlet3 extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
        //获取session对象
        HttpSession session = request.getSession();
        //获取session中的数据
        Object currentname = session.getAttribute("currentname");
        Object username = (String) currentname;
        //================================================
        out.println("欢迎" + username + "<br>");
        for (int i = 0; i < 6; i++) {
            //out.println("<a href='/param/GetServlet'>一封邮件</a> <br>");
            out.println("<a href='/session/GetServlet3'>一封邮件</a> <br>");
        }

    }
}
