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

@WebServlet(name = "EditStudent1Servlet", urlPatterns = "/EditStudent1Servlet")
public class EditStudent1Servlet extends HttpServlet {
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
        Long id = Long.valueOf(request.getParameter("id"));
        Person person = dao.get(id);
        request.setAttribute("stuedit",person);//传递给edit.jsp 用于回显被编辑学生
        //3控制页面跳转
        request.getRequestDispatcher("crudview/edit.jsp").forward(request, response);
    }

}
