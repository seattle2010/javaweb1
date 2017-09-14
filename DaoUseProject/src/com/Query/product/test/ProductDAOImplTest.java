package com.Query.product.test;

import com.Query.product.dao.IProductDAO;
import com.Query.product.dao.impl.ProductDAOImpl;
import com.Query.product.domain.Product;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/** 
* ProductDAOImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>2017</pre>
* @version 1.0 
*/ 
public class ProductDAOImplTest {
    private IProductDAO dao =new ProductDAOImpl();

/** 
* 
* Method: list() 
* 
*/ 
@Test
public void testList() throws Exception { 
    List<Product> list = dao.list();
    for(Product ele:list){
        System.out.println(ele);
    }
}

    //测试高级查询
    @Test
    public void testQuery() throws Exception {
        //List<Product> query = dao.query(null,null,null);
        List<Product> query = dao.query("M",new BigDecimal("100"),new BigDecimal("200"));
        System.out.println(query.size());
        for(Product ele:query){
            System.out.println(ele);
        }
    }

} 
