package com.luma.session2.exception;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException( String message) {
        super(message);
    }

}
