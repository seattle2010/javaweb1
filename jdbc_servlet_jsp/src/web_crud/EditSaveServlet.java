package web_crud;

import com.templateJDBCTemplate.dao.IPersonDao;
import com.templateJDBCTemplate.dao.impl.PersonDaoImpl;
import com.templateJDBCTemplate.domain.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "EditSaveServlet", urlPatterns = "/EditSaveServlet")
public class EditSaveServlet extends HttpServlet {

    private IPersonDao dao;
    @Override
    public void init() throws ServletException {
        dao = new PersonDaoImpl();
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
//1 接受请求数据
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        //String id = request.getParameter("id");
        //Long id1 = Long.valueOf(id);
        Long id = Long.valueOf(request.getParameter("id"));
        //封装对象

        Person person = new Person(name, Integer.valueOf(age));

        //2调用业务方法
        dao.update(id,person);
//控制页面跳转
        response.sendRedirect("/ListStudent1Servlet");
    }
    }


