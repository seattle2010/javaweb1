package com.mailbox.transfer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ListServlet", urlPatterns = "/param/ListServlet")
public class ListServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
        String username = request.getParameter("username");
        out.println("欢迎"+username+"<br>");
        for(int i = 0;i<6;i++){
            //out.println("<a href='/param/GetServlet'>一封邮件</a> <br>");
            out.println("<a href='/param/GetServlet?username="+username+"'>一封邮件</a> <br>");
        }
    }

}
