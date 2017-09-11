package com.crud.ServletJsp;

import templateJDBCTemplate.dao.impl.PersonDaoImpl;
import templateJDBCTemplate.domain.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ListServlet", urlPatterns = "/ListServlet")
public class ListServlet extends HttpServlet {
    private PersonDaoImpl dao;

    @Override
    public void init() throws ServletException {
        dao = new PersonDaoImpl();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
        //1接受请求参数 封装成对象

        //2调用业务方法处理请求
        List<Person> list = dao.list();
        //for(Person ele:list){
        //    System.out.println(ele);
        //}
        //3控制页面跳转
        //        共享数据
        request.setAttribute("persons",list);
        //跳转
        request.getRequestDispatcher("/crud/person_list.jsp").forward(request, response);
    }

}
