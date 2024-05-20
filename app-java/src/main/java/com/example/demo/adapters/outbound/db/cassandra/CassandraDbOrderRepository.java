package com.example.demo.adapters.outbound.db.cassandra;

import com.example.demo.adapters.outbound.db.intefaces.OrderRepositoryPort;
import com.example.demo.application.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CassandraDbOrderRepository implements OrderRepositoryPort {

    private final SpringDataCassandraOrderRepository orderRepository;

    @Autowired
    public CassandraDbOrderRepository(SpringDataCassandraOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void save(OrderDTO orderDTO) {
        orderRepository.save(new CassandraOrder(orderDTO.getId(), orderDTO.getName()));
    }
}
