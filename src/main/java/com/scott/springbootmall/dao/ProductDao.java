package com.scott.springbootmall.dao;

import com.scott.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
