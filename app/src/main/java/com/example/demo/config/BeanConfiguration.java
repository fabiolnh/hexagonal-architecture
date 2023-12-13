package com.example.demo.config;

import com.example.demo.DemoApplication;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.cassandra.CassandraDbOrderRepository;
import com.example.demo.repository.cassandra.SpringDataCassandraOrderRepository;
import com.example.demo.repository.mongo.MongoDbOrderRepository;
import com.example.demo.repository.mongo.SpringDataMongoOrderRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackageClasses = DemoApplication.class)

// Use if you want to work with Cassandra
//@EnableAutoConfiguration(exclude={
//        MongoDataAutoConfiguration.class,
//        MongoRepositoriesAutoConfiguration.class,
//        MongoAutoConfiguration.class})

// Use if you want to work with Mongo
@EnableAutoConfiguration(exclude={
        CassandraDataAutoConfiguration.class,
        CassandraRepositoriesAutoConfiguration.class,
        CassandraAutoConfiguration.class})
public class BeanConfiguration {

//
//    @Bean
//    @Primary
//    OrderRepository getRepository(SpringDataCassandraOrderRepository cassandraRepository) {
//        return new CassandraDbOrderRepository(cassandraRepository);
//    }

    @Bean
    @Primary
    OrderRepository getRepository(SpringDataMongoOrderRepository mongoRepository) {
        return new MongoDbOrderRepository(mongoRepository);
    }

}