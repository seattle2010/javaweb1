package com.Query.product.domain;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class ProductQueryObject {
    private String productName;
    private BigDecimal minSalePrice;
    private BigDecimal maxSalePrice;
}
