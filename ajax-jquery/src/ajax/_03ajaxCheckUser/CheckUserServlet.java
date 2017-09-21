package ajax._03ajaxCheckUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "CheckUserServlet", urlPatterns = "/CheckUserServlet")
public class CheckUserServlet extends HttpServlet {
    private List<String> data = Arrays.asList("tom", "jack", "rose");

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
        String username = request.getParameter("username");
        out.println(username+"<br>");
        String msg = null;
        if (data.contains(username)) {
            msg = "用户名已经被注册";
        } else {
            msg = "用户名可以被注册";
        }
        out.println(msg);
    }

}
