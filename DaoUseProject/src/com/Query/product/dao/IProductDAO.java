package com.Query.product.dao;

import com.Query.product.domain.Product;

import java.math.BigDecimal;
import java.util.List;

public interface IProductDAO {

    List<Product> list();
//min<=salePrice<=max
    List<Product> query(String name, BigDecimal minSalePirce,BigDecimal maxSalePrice);
}
