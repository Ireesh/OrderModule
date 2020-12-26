package com.geekbrains.spring.integration.order.services;

import com.geekbrains.spring.integration.order.domains.Order;

public interface OrderService {
    void save(Order order);
}
