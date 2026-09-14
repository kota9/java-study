package com.example.study;

public class OrderService {

    private Payment payment;

    public OrderService(Payment payment) {
        this.payment = payment;
    }

    public void order() {
        payment.pay();
    }
}
