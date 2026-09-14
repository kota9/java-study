package com.example.study.exception;

public class ProductNotFoundException extends BusinessException {

    public ProductNotFoundException(String errorCode, String message) {
        super(errorCode, message);
    }
}
