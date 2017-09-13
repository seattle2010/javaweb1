import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class reqrespServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取上下文路径  (项目名)
        System.out.println(request.getContextPath());
        //获取传输方式  get  post
        System.out.println(request.getMethod());
        //获取 连接信息
        System.out.println(request.getRequestURI());
        // 获取客户请求地址信息
        System.out.println(request.getRequestURL());
        // 获取客户端ip 地址   127.0.0.1
        System.out.println(request.getRemoteAddr());

        System.out.println(request.getParameter("name"));
        System.out.println(request.getParameter("password"));
        //get传送方式
        //localhost:8080/helloServlet/req?name="tom"&password="1234"

//创建输出流
        PrintWriter writer = response.getWriter();
        writer.println("helloworld");
        writer.println("<html>");
        writer.println("<body>");

        writer.println("<hr>");

        writer.println("</body>");
        writer.println("</html>");

    }

}
