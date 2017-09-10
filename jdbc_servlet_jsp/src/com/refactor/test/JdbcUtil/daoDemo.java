package com.refactor.test.JdbcUtil;

import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class daoDemo {
    @Test
    public void testInsert() throws Exception {
        String sql = "select * from t_student;";
        Statement st = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            //1 加载注册驱动
            //2获取连接对象
            conn = JdbcUtil.getconn();
            //3 创建语句对象
            st = conn.createStatement();
            //4执行sql
            rs = st.executeQuery(sql);
            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(id + "," + name + "," + age);
            }
            //5 释放资源
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, st, rs);
        }

    }
}
