import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@WebServlet("/req")
public class HttpServletRequestServlet extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //返回请求方式  返回string类型
        System.out.println(req.getMethod());
        //返回请求行中的资源名字部分 返回string类型
        System.out.println(req.getRequestURI()); 
        //返回地址全部信息
        System.out.println(req.getRequestURL()); 
        //返回请求url所属web应用的路径
        System.out.println(req.getContextPath()); 
        //访问的客户端ip地址
        System.out.println(req.getRemoteAddr());

        //地址栏上输入以下 http://localhost:8080/req?username="tom"&age=17&hobby=java&hobby=boy
        //获取get方式传送后的参数值
        String username = req.getParameter("username");
        System.out.println(username); 
        System.out.println(req.getParameter("age")); 
        //重复名称的参数 获得一个数组
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));

        //都自动装进map集合中  获取并且打印
        Map<String, String[]> map = req.getParameterMap();
        System.out.println(map);
        Collection<String[]> collection = map.values();
        Iterator<String[]> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String[] strings = iterator.next();
            System.out.println(Arrays.toString(strings)); 
        }
    }
}
