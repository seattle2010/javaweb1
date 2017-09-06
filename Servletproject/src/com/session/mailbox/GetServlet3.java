package com.session.mailbox;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetServlet3", urlPatterns = "/session/GetServlet3")
public class GetServlet3 extends HttpServlet {
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
        //==========================================
        out.println("欢迎"+username+"<br>");
        out.println("这是一个邀请函");
    }

}
