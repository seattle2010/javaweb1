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
import java.util.List;

@WebServlet(name = "ListStudent1Servlet", urlPatterns = "/ListStudent1Servlet")
public class ListStudent1Servlet extends HttpServlet {
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
//1接受请求参数

        //2 调用业务方法处理请求
        List<Person> list = dao.list();
        System.out.println(list);
        request.setAttribute("stu",list);
        //3控制界面跳转
        request.getRequestDispatcher("/crudview/person_list.jsp").forward(request, response);
    }

}
