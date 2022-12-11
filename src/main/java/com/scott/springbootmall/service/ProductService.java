package com.scott.springbootmall.service;

import com.scott.springbootmall.dto.ProductQueryParams;
import com.scott.springbootmall.dto.ProductRequest;
import com.scott.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
