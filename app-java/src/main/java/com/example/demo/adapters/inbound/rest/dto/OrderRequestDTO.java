package com.example.demo.adapters.inbound.rest.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequestDTO {

    @NotNull private String name;
    @JsonCreator
    public OrderRequestDTO(@JsonProperty("name") @NotNull final String name) {
        this.name = name;
    }

}
