package com.scott.springbootmall.service;

import com.scott.springbootmall.dto.CreateOrderRequest;
import com.scott.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
