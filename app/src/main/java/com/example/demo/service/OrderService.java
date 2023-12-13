package com.example.demo.service;

import com.example.demo.domain.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(final OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public UUID createOrder(final String name) {
        final Order order = new Order(UUID.randomUUID(), name);
        orderRepository.save(order);
        return order.getId();
    }

}
