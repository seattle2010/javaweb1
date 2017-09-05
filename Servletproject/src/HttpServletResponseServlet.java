import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/res")
public class HttpServletResponseServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决输出中文时候乱码问题
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        //或者写成一行
        //response.setContentType("text/html:UTF-8");

        //OutputStream getOutputStream()  获取字节输出流对象  文件下载
        //        PrintWriter getWriter()  获取字符输出流对象
        PrintWriter out = response.getWriter();
        out.println("注册信息");
        out.println("register");
    }

}
