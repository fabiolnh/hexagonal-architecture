package com.example.demo.application.dto;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class OrderDTO {
    UUID id;
    String name;
}
