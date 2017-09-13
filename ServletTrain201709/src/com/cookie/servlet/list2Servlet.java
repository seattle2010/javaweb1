package com.cookie.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

@WebServlet(name = "list2Servlet", urlPatterns = "/cookie/list2Servlet")
public class list2Servlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
        //获得浏览器中已经自己设置进去的cookie,用get方式获取到cookies的数组
        String username = null;
       Cookie[] cookies = request.getCookies();
        for(Cookie cookie:cookies){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println(name+","+value);
            if("current".equals(name)){
                username = URLDecoder.decode(value, "UTF-8");
                System.out.println(username); 
            }
        }
/*        String username = null;
        //用session获得前一个servlet设置的session值
        HttpSession session = request.getSession();
        //返回一个Object类型,
        Object current = session.getAttribute("current");
        username = (String) current;*/

        out.println("欢迎访客" + username + "<br>");
        for (int i = 0; i < 6; i++) {
            out.println("<a href='/cookie/get2Servlet'>一封来自远方的信</a><br>");
        }

    }
}
