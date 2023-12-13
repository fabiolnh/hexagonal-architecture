package com.example.demo.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class OrderResponse {

    private final UUID id;

    public OrderResponse(final UUID id) {
        this.id = id;
    }

}
