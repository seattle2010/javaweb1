package ajax;

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
    private ProductDAOImpl dao;
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
        List<Product> products = dao.getName(productName);
        for(Product ele:products){
            if (ele.getProductName() == productName) {
                out.write("true");
            } else {
                out.write("false");

            }
        }

        }

    }


