package com.luma.session2.service;

import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public String healthCheck() {

        return "order Service is up" ;

    }
}
