package com.scott.springbootmall.service;

import com.scott.springbootmall.dto.CreateOrderRequest;
import com.scott.springbootmall.dto.OrderQueryParams;
import com.scott.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);
}
