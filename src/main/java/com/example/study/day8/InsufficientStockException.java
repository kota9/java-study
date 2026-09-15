package com.example.study.day8;

public class InsufficientStockException extends BusinessException {

    public InsufficientStockException(String errorCode, String message) {
        super(errorCode, message);
    }
}
