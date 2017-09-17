package ajax._04ajaxLoginCheck;

import lombok.Setter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginCheckServlet", urlPatterns = "/LoginCheckServlet")
public class LoginCheckServlet extends HttpServlet {
    @Setter
    private String username;
    private String password;
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
System.out.println(username+","+password); 
    }

}
