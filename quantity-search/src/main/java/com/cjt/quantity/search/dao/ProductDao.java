package com.cjt.quantity.search.dao;

import com.cjt.quantity.search.domain.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {

    List<Product> getAllProduct();

    List<Product> getProductsByName(@Param("productName") String productName);
}