package com.example.demo.repository.mongo;

import com.example.demo.domain.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MongoDbOrderRepository implements OrderRepository {

    private final SpringDataMongoOrderRepository orderRepository;

    @Autowired
    public MongoDbOrderRepository(final SpringDataMongoOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void save(final Order order) {
        orderRepository.save(order);
    }
}
