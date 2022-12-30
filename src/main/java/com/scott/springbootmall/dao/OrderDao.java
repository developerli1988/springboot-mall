package com.scott.springbootmall.dao;

import com.scott.springbootmall.dto.OrderQueryParams;
import com.scott.springbootmall.model.Order;
import com.scott.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer createOrder(Integer userId, Integer totalAmount);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

    Order getOrderById(Integer orderId);
}
