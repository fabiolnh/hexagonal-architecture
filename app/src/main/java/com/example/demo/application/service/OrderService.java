package com.example.demo.application.service;

import com.example.demo.adapters.inbound.rest.dto.OrderRequestDTO;
import com.example.demo.application.dto.OrderDTO;
import com.example.demo.adapters.outbound.db.intefaces.OrderRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    private final OrderRepositoryPort orderRepository;

    public OrderService(final OrderRepositoryPort orderRepository) {
        this.orderRepository = orderRepository;
    }

    public UUID createOrder(final OrderRequestDTO orderRequestDTO) {
        OrderDTO orderDTO = OrderDTO.builder().name(orderRequestDTO.getName()).build();
        orderRepository.save(orderDTO);
        return orderDTO.getId();
    }

}
