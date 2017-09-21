package SearchProduct.shopping.query;

import SearchProduct.shopping.dao.impl.ProductDAOImpl;
import SearchProduct.shopping.domain.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;

@WebServlet(name = "QueryResultServlet", urlPatterns = "/QueryResultServlet")
public class QueryResultServlet extends HttpServlet {
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
        //取值
        String productName = request.getParameter("productName");
        String minSalePrice = request.getParameter("minSalePrice");
        String maxSalePrice = request.getParameter("maxSalePrice");
        //调用业务方法 把取得的值付给形参
        List<Product> list = dao.QueryList(productName,
                new BigDecimal(minSalePrice), new BigDecimal(maxSalePrice));
        request.setAttribute("products",list);
        request.getRequestDispatcher("/QueryView/List.jsp").
                forward(request, response);
    }

}
