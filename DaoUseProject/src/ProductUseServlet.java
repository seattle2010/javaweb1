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

@WebServlet(name = "ProductUseServlet", urlPatterns = "/ProductUseServlet")
public class ProductUseServlet extends HttpServlet {
    private IProductDAO dao;
    @Override
    public void init() throws ServletException {
        dao = new ProductDAOImpl();
    }

    //http://localhost:8080/ProductUseServlet?cat=delete
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String cat = request.getParameter("cat");
        System.out.println("service");
        System.out.println(cat); 

        if("delete".equals(cat)){
        this.delete(request, response);
        }else if("save".equals(cat)){
        this.save(request, response);
        }else if("edit".equals(cat)){
        this.edit(request, response);
        }else if("toEdit".equals(cat)){
        this.toEdit(request, response);
        } else {
        this.list(request, response);
        }
     
    }
    //--------------------list--------------------------
    protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("list");
        List<Product> list = dao.list();
        request.setAttribute("pro",list);

        request.getRequestDispatcher("ProductViews/productList.jsp").forward(request, response);
    }
    //--------------------save--------------------------
    protected void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 System.out.println("save");        
    }
    //--------------------edit--------------------------
    protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("edit"); 
    }
    //---------------------toEdit-------------------------
    protected void toEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("toEdit"); 
    }
    //----------------------delete------------------------
    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("delete"); 
    }

}
