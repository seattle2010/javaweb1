import templateJDBCTemplate.dao.impl.PersonDaoImpl;
import templateJDBCTemplate.domain.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "CrudServlet", urlPatterns = "/CrudServlet")
public class CrudServlet extends HttpServlet {
    //=========
    private PersonDaoImpl dao;
    //=========
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
        dao = new PersonDaoImpl();
        List<Person> list = dao.list();
        //把对象放入到request对象中
        request.setAttribute("personList",list);
        System.out.println(request.getAttribute("personList"));

request.getRequestDispatcher("/crud_list.jsp").forward(request, response);
    }
}
