package com.example.study.exception;

public class InsufficientStockException extends BusinessException {

    public InsufficientStockException(String errorCode, String message) {
        super(errorCode, message);
    }
}
