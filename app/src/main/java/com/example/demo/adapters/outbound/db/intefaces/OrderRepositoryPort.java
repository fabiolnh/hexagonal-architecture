package com.example.demo.adapters.outbound.db.intefaces;

import com.example.demo.application.dto.OrderDTO;

public interface OrderRepositoryPort {

    void save(OrderDTO orderDTO);
}
