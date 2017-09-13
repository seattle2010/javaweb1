package com.web.servlet;


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

@WebServlet(name = "ListStudentServlet", urlPatterns = "/student/ListStudentServlet")
public class ListStudentServlet extends HttpServlet {

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
//    因为是查询 所以没有请求参数
        //2 调用业务方法 处理请求
        List<Person> list = dao.list();
        for(Person ele:list){
            System.out.println(ele);
        }
                //3控制页面跳转
        //把结果数据共享给list.jsp
        request.setAttribute("students",list);
        request.getRequestDispatcher("/WEB-INF/views/student/list.jsp").forward(request, response);
    }
}
