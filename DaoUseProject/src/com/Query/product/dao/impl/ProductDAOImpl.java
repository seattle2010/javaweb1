package com.Query.product.dao.impl;

import com.Query.product.JDBCTemplate;
import com.Query.product.dao.IProductDAO;
import com.Query.product.domain.Product;

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

    @Override
    public List<Product> query(String name, BigDecimal minSalePrice, BigDecimal maxSalePrice) {
        //拼接sql
        // WHERE 1=1 判断是否是第一个条件
        StringBuilder sql = new StringBuilder("SELECT * FROM product WHERE 1=1");
        List<Object> params = new ArrayList<>();
        //商品的名称
        if(hasLength(name)){
            sql.append(" AND productName LIKE ?");
            params.add("%" + name + "%");
        }
        //最低零售价
        if(minSalePrice != null){
            sql.append(" AND salePrice >= ?");
            params.add(minSalePrice);
        }
        //最高零售价
        if(maxSalePrice != null){
            sql.append(" AND salePrice <= ?");
            params.add(maxSalePrice);
        }
        List<Product> productList = JDBCTemplate.query(sql.toString(), params.toArray());
        return productList;
    }

    public static boolean hasLength(String str) {
        return str != null && !"".equals(str.trim());
    }
}
