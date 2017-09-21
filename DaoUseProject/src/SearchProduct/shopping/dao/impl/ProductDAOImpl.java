package SearchProduct.shopping.dao.impl;

import SearchProduct.shopping.JDBCTemplate;
import SearchProduct.shopping.dao.IProductDAO;
import SearchProduct.shopping.domain.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements IProductDAO {
    @Override
    public List<Product> list() {
        String sql = "SELECT * FROM product";
        List<Product> queryall = JDBCTemplate.query(sql);
        return queryall;
    }
    //SELECT * FROM product WHERE productName LIKE '%M%' AND salePrice>= 100 AND salePrice <= 200;
    //SELECT * FROM product WHERE productName LIKE productName AND minSalePrice >=minSalePrice AND maxSalePrice <= maxSalePrice
    @Override
    public List<Product> QueryList(String productName, BigDecimal minSalePrice, BigDecimal maxSalePrice) {
        StringBuilder sql = new StringBuilder("SELECT * FROM product WHERE 1=1");
        List<Object> params = new ArrayList<>();

        if(hasLength(productName)){
        sql.append(" AND productName LIKE ?");
            params.add("%" + productName + "%");
        }
        if(minSalePrice != null){
            sql.append(" AND salePrice >= ?");
            params.add(minSalePrice);
        }
        if(maxSalePrice != null){
            sql.append(" AND salePrice <= ?");
            params.add(maxSalePrice);
        }
        List<Product> queryAll = JDBCTemplate.query(sql.toString(),params.toArray());
        return queryAll;
    }
    protected static boolean hasLength(String str) {
        return str != null && !"".equals(str.trim());
    }
}
