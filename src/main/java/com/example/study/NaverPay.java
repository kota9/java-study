package com.example.study;

public class NaverPay implements Payment {
    @Override
    public void pay() {
        System.out.println("네이버페이 결제");
    }
}
