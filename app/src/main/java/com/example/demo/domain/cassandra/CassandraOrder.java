package com.example.demo.domain.cassandra;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
public class CassandraOrder {

    @PrimaryKey
    private UUID id;

    private String name;

}
