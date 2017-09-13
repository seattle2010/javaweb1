package Crud;

import templateJDBCTemplate.dao.IPersonDao;
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

@WebServlet(name = "Person1ListServlet", urlPatterns = "/Person1ListServlet")
public class Person1ListServlet extends HttpServlet {
    private IPersonDao dao;
    @Override
    public void init() throws ServletException {
        dao = new PersonDaoImpl();
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
//=================Person1ListServlet============================
        List<Person> person = dao.list();
        request.setAttribute("person",person);
        request.getRequestDispatcher("views/person1_list.jsp").forward(request, response);
    }
}
