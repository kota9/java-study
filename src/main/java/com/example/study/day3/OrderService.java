package com.example.study.day3;

import com.example.study.day2.Payment;

public class OrderService {

    private Payment payment;

    public OrderService(Payment payment) {
        this.payment = payment;
    }

    public void order() {
        payment.pay();
    }
}
