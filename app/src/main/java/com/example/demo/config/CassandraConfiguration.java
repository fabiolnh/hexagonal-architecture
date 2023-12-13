package com.example.demo.config;

import com.example.demo.repository.cassandra.SpringDataCassandraOrderRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@EnableCassandraRepositories(basePackageClasses = SpringDataCassandraOrderRepository.class)
public class CassandraConfiguration {

}
