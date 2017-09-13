package scope;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ScopeServlet", urlPatterns = "/ScopeServlet")
public class ScopeServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
//servlet的三大作用域
//        ------------------------------------------
//        作用域                       对象类型
//        request                      HttpServletRequest
//        session                      HttpSession
//        application                  ServletContext
//
//        request是表示一次请求,在整个本次请求中,数据都在有效范围内,能够共享数据
//        session是表示一次会话,在浏览器没有关闭前,整个session作用域有效,共享数据
//        application是tomcat启动后创建,单例模式,在tomcat整个生命周期中有效,只创建一次

        //-----------------------------------------
        Integer numInRequest = (Integer) request.getAttribute("NUM_IN_REQUEST");
        if (numInRequest == null) {
            request.setAttribute("NUM_IN_REQUEST", 1);
        } else {
            request.setAttribute("NUM_IN_REQUEST",numInRequest+1);
        }
        //------------------------------------------
        //setAttribute(String,Object)
        //getAttribute(String)
        //因为返回的是object类型,这里需要先强制转换成Integer
        Integer numInSession = (Integer) request.getSession().getAttribute("NUM_IN_SESSION");
        if (numInSession == null) {
            request.getSession().setAttribute("NUM_IN_SESSION", 1);
        } else {
            request.getSession().setAttribute("NUM_IN_SESSION", numInSession+1);
        }


        //--------------------------------------------
        Integer numInApp = (Integer) request.getServletContext().getAttribute("NUM_IN_APP");
        if (numInApp == null) {
            request.getServletContext().setAttribute("NUM_IN_APP", 1);
        } else {
            request.getServletContext().setAttribute("NUM_IN_APP",numInApp+1);
        }
        request.getRequestDispatcher("/ResultServlet").forward(request, response);


    }

}
