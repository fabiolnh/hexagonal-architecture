package com.example.demo.adapters.outbound.db.mongo;

import com.example.demo.adapters.outbound.db.intefaces.OrderRepositoryPort;
import com.example.demo.application.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MongoDbOrderRepository implements OrderRepositoryPort {

    private final SpringDataMongoOrderRepository orderRepository;

    @Autowired
    public MongoDbOrderRepository(final SpringDataMongoOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void save(OrderDTO orderDTO) {
        orderRepository.save(new MongoOrder(orderDTO.getId(), orderDTO.getName()));
    }
}
