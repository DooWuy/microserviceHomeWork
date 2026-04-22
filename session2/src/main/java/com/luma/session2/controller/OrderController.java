package com.luma.session2.controller;

import com.luma.session2.entity.Order;
import com.luma.session2.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/health-check")
    public String healthCheck() {
        return orderService.healthCheck();
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id ) {

        return orderService.getOrderById(id) ;

    }
}
