package com.transfer.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "listServlet", urlPatterns = "/get/listServlet")
public class listServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
        String username = request.getParameter("username");
        out.println("欢迎访客"+username+"<br>");
        for(int i = 0;i<6;i++){
            out.println("<a href='/get/getServlet?username="+username+"'>一封来自远方的信</a><br>");
        }
    }
}
