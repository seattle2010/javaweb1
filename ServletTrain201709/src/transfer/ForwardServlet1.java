package transfer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ForwardServlet1", urlPatterns = "/ForwardServlet1")
public class ForwardServlet1 extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
    System.out.println("Servlet1 before"); //控制台
    out.println("Servlet1 before");//页面
//---------------------------------------------------
//        Servlet之间的数据共享:
//        两种方式:
//        1 请求转发
//作用域名.getRequestDispatcher("要转发到的地址").forward(request, response);
//        特点
//        1 转发后,地址不变
//        2 一直是同一个请求,其实是包含关系
//        3  共享同一个请求中的数据
//        4  最终响应是由servlet2决定
//        5  不能跨域访问
//        6  能够访问WEB-INF下的页面

//        什么时候用 请求转发 ,重定向
//        请求转发
//传递数据
//WEB-INF下面的内容
//
//        重定向
//跨域访问
//其他情况随意


request.getRequestDispatcher("/WEB-INF/longin.html").forward(request, response);

        System.out.println("Servlet1 after");
        out.println("Servlet1 after");
    }

}
