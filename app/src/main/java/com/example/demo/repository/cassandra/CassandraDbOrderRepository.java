package com.example.demo.repository.cassandra;

import com.example.demo.domain.Order;
import com.example.demo.domain.cassandra.CassandraOrder;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CassandraDbOrderRepository implements OrderRepository {

    private final SpringDataCassandraOrderRepository orderRepository;

    @Autowired
    public CassandraDbOrderRepository(SpringDataCassandraOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void save(Order order) {
        orderRepository.save(new CassandraOrder(order.getId(), order.getName()));
    }

}
