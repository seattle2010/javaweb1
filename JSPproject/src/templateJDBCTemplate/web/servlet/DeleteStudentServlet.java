package templateJDBCTemplate.web.servlet;


import templateJDBCTemplate.dao.IPersonDao;
import templateJDBCTemplate.dao.impl.PersonDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//处理删除指定id学生的请求
@WebServlet(name = "DeleteStudentServlet", urlPatterns = "/student/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
    //----------------------------------
    private IPersonDao dao;
    @Override
    public void init() throws ServletException {
        dao = new PersonDaoImpl();
    }

    //----------------------------------
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
//1 接受请求参数 封装对象
        Long id = Long.valueOf(request.getParameter("id"));
        //2调用业务方法处理请求
dao.delete(id);
                //3控制页面跳转
        request.getRequestDispatcher("/student/ListStudentServlet").forward(request, response);
    }

}
