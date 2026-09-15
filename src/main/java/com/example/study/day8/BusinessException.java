package com.example.study.day8;

public class BusinessException extends RuntimeException {

    private final String errorCode;

    public BusinessException(String errorCode, String message) {
        super(message);
        this.errorCode = message;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
