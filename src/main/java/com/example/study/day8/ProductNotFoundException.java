package com.example.study.day8;

public class ProductNotFoundException extends BusinessException {

    public ProductNotFoundException(String errorCode, String message) {
        super(errorCode, message);
    }
}
