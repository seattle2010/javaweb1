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

@WebServlet(name = "PersonSaveServlet", urlPatterns = "/PersonSaveServlet")
public class PersonSaveServlet extends HttpServlet {
    private IPersonDao dao;
    @Override
    public void init() throws ServletException {
        dao = new PersonDaoImpl();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //================PersonSaveServlet=============================
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        Person person = new Person();
        person.setName(name);
        person.setAge(Integer.valueOf(age));
        dao.save(person);
        response.sendRedirect("/Person1ListServlet");

    }

}
