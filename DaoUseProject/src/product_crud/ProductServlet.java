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
import java.math.BigDecimal;
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
        } else if ("toUpdate".equals(cmd)) {
            this.toUpdate(request, response);
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
        request.getRequestDispatcher("/ProductViews/productQueryList.jsp").forward(request, response);
    }
//删除指定商品
//    -----------------------delete----------------------------------------
    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("delete"); 
    }
//进入编辑界
    //-------------------------add-------------------------------------------
    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("edit");
        request.getRequestDispatcher("/ProductViews/productAdd.jsp").forward(request, response);
    }
    //新增操作
    //---------------------------save---------------------------------------------
    protected void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("save");
        Product product = new Product();
        this.request2Obj(request, product);
        dao.save(product);
    }
    //更新操作
    //---------------------------toUpdate-------------------------------------------------
    protected void toUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("toUpdate");
        request.getRequestDispatcher("/ProductViews/productUpdate.jsp").forward(request, response);
    }

    //更新操作
    //---------------------------update-------------------------------------------------
    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("update");
    }
    //================================================================================
//把请求中的参数封装到product对象中
    private void request2Obj(HttpServletRequest request, Product product) {
        String productName = request.getParameter("productName");
        String brand = request.getParameter("brand");
        String supplier = request.getParameter("supplier");
        String salePrice = request.getParameter("salePrice");
        String costPrice = request.getParameter("costPrice");
        String cutoff = request.getParameter("cutoff");
        String dir_id = request.getParameter("dir_id");
        //省略非空判断
        //if(不为空){
        //    product.setProductName(productName);
        //}
        product.setProductName(productName);
        product.setBrand(brand);
        product.setSupplier(supplier);

        product.setSalePrice(new BigDecimal(salePrice));
        product.setCostPrice(new BigDecimal(costPrice));
        product.setCutoff(Double.valueOf(cutoff));
        product.setDir_id(Long.valueOf(dir_id));
    }
}
