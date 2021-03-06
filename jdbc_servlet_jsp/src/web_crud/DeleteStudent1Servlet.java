package web_crud;

import com.templateJDBCTemplate.dao.IPersonDao;
import com.templateJDBCTemplate.dao.impl.PersonDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DeleteStudent1Servlet", urlPatterns = "/DeleteStudent1Servlet")
public class DeleteStudent1Servlet extends HttpServlet {
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
        //2调用业务方法

        dao.delete(id);
        //3 控制页面跳转
        response.sendRedirect("/ListStudent1Servlet");
    }

}
