package SearchProduct.shopping.dao;

import SearchProduct.shopping.domain.Product;

import java.math.BigDecimal;
import java.util.List;

public interface IProductDAO {

    List<Product> list();

    List<Product> QueryList(String productName, BigDecimal minSalePrice,BigDecimal maxSalePrice);
}
