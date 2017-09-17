package ajax;

import com.shopping.dao.IProductDAO;
import com.shopping.dao.impl.ProductDAOImpl;
import com.shopping.domain.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "CheckServlet", urlPatterns = "/CheckServlet")
public class CheckServlet extends HttpServlet {
    private IProductDAO dao;
    @Override
    public void init() throws ServletException {
        dao = new ProductDAOImpl();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================

        String productName = request.getParameter("productName");
        //!!!!解决乱码问题
        productName = new String(productName.getBytes("iso8859-1"), "utf-8");
        out.write(productName);
        List<Product> products = dao.getName(productName);
        //List<Product> products = dao.getName("罗技M90");

        System.out.println(products);
/*String msg = null;
for(Product ele:products){
    System.out.println(ele.getProductName());
    if (ele.getProductName().contains(productName)) {
        //out.write("true");
        msg = "用户名已经被注册";
    } else {
        msg = "用户名可以被注册";


    }
}
        out.write(msg);*/
        }



    }


