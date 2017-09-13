package com.shopping;



import com.shopping.domain.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class JDBCTemplate {
    //DML操作模板
    public static int update(String sql, Object...params) {
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = JdbcUtil.getconn();
            ps = conn.prepareStatement(sql);
            for(int i = 0;i<params.length;i++){
                ps.setObject(i+1,params[i]);
            }
            return ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn,ps,null);
        }
        return 0;
    }

    //DQL操作模板
    public static List<Product> query(String sql, Object... params) {
        List<Product> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            conn = JdbcUtil.getconn();
            ps = conn.prepareStatement(sql);
            for(int i = 0;i<params.length;i++){
                ps.setObject(i + 1, params[i]);

            }
            rs = ps.executeQuery();
            while (rs.next()) {

                Product product = new Product();
                product.setId(rs.getLong("id"));
                product.setProductName(rs.getString("productName"));
                product.setBrand(rs.getString("brand"));
                product.setSupplier(rs.getString("supplier"));
                product.setSalePrice(rs.getBigDecimal("salePrice"));
                product.setCostPrice(rs.getBigDecimal("costPrice"));
                product.setCutoff(rs.getDouble("cutoff"));
                product.setDir_id(rs.getLong("dir_id"));

                list.add(product);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn,ps,rs);
        }
        return list;
    }

}
