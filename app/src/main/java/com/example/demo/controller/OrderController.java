package com.example.demo.controller;

import com.example.demo.controller.dto.OrderRequest;
import com.example.demo.controller.dto.OrderResponse;
import com.example.demo.service.OrderService;
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
    OrderResponse createOrder(@RequestBody final OrderRequest createOrderRequest) {
        final UUID id = orderService.createOrder(createOrderRequest.getName());

        return new OrderResponse(id);
    }

}
