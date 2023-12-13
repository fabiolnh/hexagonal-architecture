package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Order {

    private UUID id;
    private String name;

}
