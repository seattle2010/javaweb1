package com.cookie.mailbox;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetServlet2", urlPatterns = "/cookie/GetServlet2")
public class GetServlet2 extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
        String username = "";
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie:cookies){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println(name+","+value);
            if("currentname".equals(name)){
                username = value;
                //解决乱码
                //username = URLDecoder.decode(value, "UTF-8");
            }
        }
        //==========================================
        out.println("欢迎"+username+"<br>");
        out.println("这是一个邀请函");
    }

}
