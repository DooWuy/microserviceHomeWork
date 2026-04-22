package com.luma.session2.service;

import com.luma.session2.entity.Order;
import com.luma.session2.exception.OrderNotFoundException;
import com.luma.session2.repository.IOderRepository;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final IOderRepository orderRepository ;
    public String healthCheck() {

        return "order Service is up" ;

    }
    public Order getOrderById ( Long id ) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new OrderNotFoundException(
                        "Order net found with id " + id
                )) ;

    }
}
