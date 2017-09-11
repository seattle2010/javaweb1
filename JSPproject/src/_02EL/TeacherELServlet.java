package _02EL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TeacherELServlet", urlPatterns = "/TeacherELServlet")
public class TeacherELServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
        Teacher teacher = new Teacher();
        System.out.println(teacher);
        request.setAttribute("p",teacher);
        request.getRequestDispatcher("/teacherEL/teacherEl.jsp").forward(request,response);
    }

}
