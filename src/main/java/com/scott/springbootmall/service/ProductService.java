package com.scott.springbootmall.service;

import com.scott.springbootmall.dto.ProductRequest;
import com.scott.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
