package _02register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println(request.getRequestURI()); 
System.out.println("用户注册信息");
        //city=dl
        String city = request.getParameter("city");
        System.out.println(city); 
        //gender=boy
        String gender = request.getParameter("gender");
        System.out.println(gender); 
        //hobby=java
        //hobby=c
        //hobby=girl
        String[] hobbies = request.getParameterValues("hobby");
System.out.println(Arrays.toString(hobbies)); 
        //intro=city
        String intro = request.getParameter("intro");
        System.out.println(intro); 
        //password=1234
        String password = request.getParameter("password");
        System.out.println(password); 
        //username=tom
        String username = request.getParameter("username");
        System.out.println(username); 


    }

}
