package com.shopping.dao.impl;

import com.shopping.JDBCTemplate;
import com.shopping.dao.IProductDAO;
import com.shopping.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements IProductDAO {
    @Override
    public void save(Product obj) {
        String sql = "INSERT INTO product (productName,brand,supplier,salePrice,costPrice,cutoff,dir_id) VALUES (?,?,?,?,?,?,?)";
        JDBCTemplate.update(sql, obj.getProductName(),obj.getBrand(),obj.getSupplier(),obj.getSalePrice(),obj.getCostPrice(),obj.getCutoff(),obj.getDir_id());

    }

    @Override
    public void update(Product obj) {
        String sql = "UPDATE product SET productName = ?,brand =?,supplier=?,salePrice=?,costPrice=?,cutoff=?,dir_id=? WHERE id =?";
        JDBCTemplate.update(sql,obj.getProductName(),obj.getBrand(),obj.getSupplier(),obj.getSalePrice(),obj.getCostPrice(),obj.getCutoff(),obj.getDir_id(),obj.getId());

    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM product WHERE id = ?";
        JDBCTemplate.update(sql, id);
    }

    @Override
    public Product get(Long id) {

        String sql = "SELECT * FROM product WHERE id = ?";
        List<Product> querylist = JDBCTemplate.query(sql, id);
        return querylist.size() ==1 ?querylist.get(0):null;
    }

    @Override
    public List<Product> list() {
        String sql = "SELECT * FROM product";
        List<Product> queryall = JDBCTemplate.query(sql);
        return queryall;
    }

    @Override
    public List<Product> getName(String productName) {
            //拼接sql
            // WHERE 1=1 判断是否是第一个条件
            StringBuilder sql = new StringBuilder("SELECT * FROM product WHERE 1=1");
            List<Object> params = new ArrayList<>();
            //商品的名称
            if(hasLength(productName)){
                sql.append(" AND productName = ? limit 1");
                params.add(productName);
            }

        List<Product> productList = JDBCTemplate.query(sql.toString(), params.toArray());
        return productList;
        }

    public static boolean hasLength(String str) {
        return str != null && !"".equals(str.trim());
    }


}
