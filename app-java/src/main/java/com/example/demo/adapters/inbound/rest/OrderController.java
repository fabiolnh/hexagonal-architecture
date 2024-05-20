package com.example.demo.adapters.inbound.rest;

import com.example.demo.adapters.inbound.rest.dto.OrderRequestDTO;
import com.example.demo.adapters.inbound.rest.dto.OrderResponseDTO;
import com.example.demo.application.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderResponseDTO createOrder(@RequestBody final OrderRequestDTO orderRequestDTO) {
        final UUID id = orderService.createOrder(orderRequestDTO);

        return new OrderResponseDTO(id);
    }

}
