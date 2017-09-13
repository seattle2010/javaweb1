package product_crud;

import com.shopping.dao.IProductDAO;
import com.shopping.dao.impl.ProductDAOImpl;
import com.shopping.domain.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/ProductServlet")
public class ProductServlet extends HttpServlet {
    private IProductDAO dao;

    @Override
    public void init() throws ServletException {
        dao = new ProductDAOImpl();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");//对post有效
        String cmd = request.getParameter("cmd");
        if("add".equals(cmd)){
        this.add(request, response);
        }else if("delete".equals(cmd)){
        this.delete(request, response);
        }else if("save".equals(cmd)){
        this.save(request, response);
        } else if ("update".equals(cmd)) {
            this.update(request, response);
        } else {
            this.list(request, response);
        }
    }

    //显示商品列表
    protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("list");
        List<Product> list = dao.list();
        request.setAttribute("products",list);
        request.getRequestDispatcher("/ProductViews/productList.jsp").forward(request, response);
    }
//删除指定商品
    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("delete"); 
    }
//进入编辑界面
    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("edit");
        request.getRequestDispatcher("/ProductViews/productAdd.jsp").forward(request, response);
    }
    //新增操作
    protected void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("save"); 
    }
    //更新操作
    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("update");
    }

}
