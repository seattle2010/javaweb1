package Crud;

import templateJDBCTemplate.dao.IPersonDao;
import templateJDBCTemplate.dao.impl.PersonDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Person1DeleteServlet", urlPatterns = "/Person1DeleteServlet")
public class Person1DeleteServlet extends HttpServlet {
    private IPersonDao dao;
    @Override
    public void init() throws ServletException {
        dao = new PersonDaoImpl();
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
//================Person1DeleteServlet=============================
        Long id = Long.valueOf(request.getParameter("id"));
        dao.delete(id);
        response.sendRedirect("/Person1ListServlet");
        //=======

    }

}
