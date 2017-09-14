package com.Query.product.query;

import com.Query.product.dao.impl.ProductDAOImpl;
import com.Query.product.domain.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;

@WebServlet(name = "ProductSimpleServlet", urlPatterns = "/ProductSimpleServlet")
public class ProductSimpleServlet extends HttpServlet {
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
        String minSalePrice = request.getParameter("minSalePrice");
        String maxSalePrice = request.getParameter("maxSalePrice");

        List<Product> list = dao.query(productName,new BigDecimal(minSalePrice),new BigDecimal(maxSalePrice));
        request.setAttribute("products",list);
        request.getRequestDispatcher("/ProductQuery/productQueryList.jsp").forward(request, response);
    }

}
