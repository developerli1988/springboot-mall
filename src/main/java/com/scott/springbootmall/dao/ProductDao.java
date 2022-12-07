package com.scott.springbootmall.dao;

import com.scott.springbootmall.dto.ProductRequest;
import com.scott.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
