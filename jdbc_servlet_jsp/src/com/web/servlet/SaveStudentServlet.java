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

@WebServlet(name = "SaveStudentServlet", urlPatterns = "/student/SaveStudentServlet")
public class SaveStudentServlet extends HttpServlet {

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
//1.接受请求参数 封装对象
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        Person stu = new Person(name, Integer.valueOf(age));
        //2调用业务方法
        String id = request.getParameter("id");
        if(hasLength(id)){
           //  //stu.setId(Long.valueOf(id));
            dao.update(Long.valueOf(id),stu);
        }else {  //新增
        dao.save(stu);
        }
                //3控制转发
        response.sendRedirect("/student/ListStudentServlet");
    }
    //为了判断是否带进来id 写的判断方法
    private boolean hasLength (String str){
        return str != null && !"".equals(str.trim());
    }

}
