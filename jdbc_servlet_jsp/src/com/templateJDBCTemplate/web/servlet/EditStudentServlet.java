package com.templateJDBCTemplate.web.servlet;

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

@WebServlet(name = "EditStudentServlet", urlPatterns = "/student/EditStudentServlet")
public class EditStudentServlet extends HttpServlet {

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
    //1接受请求参数
        String sid = request.getParameter("id");

        //2 调用业务方法
        if(hasLength(sid)){

        Person stu = dao.get(Long.valueOf(sid));
        //传递给edit.jsp  用于回显被编辑的学生
        request.setAttribute("student",stu);
        }
        //3 跳转页面
        request.getRequestDispatcher("/WEB-INF/views/student/edit.jsp").forward(request, response);
    }

        //为了判断是否带进来id 写的判断方法
        private boolean hasLength (String str){
        return str != null && !"".equals(str.trim());
    }

    }

