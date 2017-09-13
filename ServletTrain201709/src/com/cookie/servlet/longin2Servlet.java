package com.cookie.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

@WebServlet(name = "longin2Servlet", urlPatterns = "/cookie/login2Servlet")
public class longin2Servlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
        String username = request.getParameter("username");
        //cookie 的乱码问题
Cookie c = new Cookie("current", URLEncoder.encode(username,"UTF-8"));
        response.addCookie(c);
        //-------------------------
        //用session的方式进行数据传递
        //创建一个session
        // key和value的形式进行储存  用getSession获取和设置session对象
        HttpSession session = request.getSession();
        //cookie只能存字符串,而session在value里面可以存Object
        session.setAttribute("current",username);
        //原理 通过cookie传递一个set-cookie :javasessionid XXXXXXXXXXXX

        out.println("欢迎访客"+username+"<br>");
        out.println("<a href='/cookie/list2Servlet'>进入收件箱</a>");
    }

}
