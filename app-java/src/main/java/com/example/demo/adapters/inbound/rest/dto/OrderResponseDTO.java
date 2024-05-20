package com.example.demo.adapters.inbound.rest.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class OrderResponseDTO {

    private UUID id;

    public OrderResponseDTO(final UUID id) {
        this.id = id;
    }

}
