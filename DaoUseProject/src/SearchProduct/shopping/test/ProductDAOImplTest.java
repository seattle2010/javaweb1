package SearchProduct.shopping.test;

import SearchProduct.shopping.dao.IProductDAO;
import SearchProduct.shopping.dao.impl.ProductDAOImpl;
import SearchProduct.shopping.domain.Product;
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
@Test
public void testQuery() throws Exception {
    List<Product> list = dao.QueryList("M", new BigDecimal(100),new BigDecimal(200));
    System.out.println(list.size());
    for(Product ele:list){
        System.out.println(ele.toString());
    }

}


} 
