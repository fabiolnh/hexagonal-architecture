package com.example.demo.repository.cassandra;

import java.util.UUID;

import com.example.demo.domain.cassandra.CassandraOrder;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataCassandraOrderRepository extends CassandraRepository<CassandraOrder, UUID> {
}
