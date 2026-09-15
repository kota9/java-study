package com.example.study.day3;

public enum OrderStatus {

    READY("주문 준비"),
    PAID("결제 완료"),
    SHIPPING("배송 중");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}