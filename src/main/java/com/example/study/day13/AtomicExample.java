package com.example.study.day13;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    public static void main(String[] args) throws InterruptedException {

        AtomicInteger stock = new AtomicInteger(100);

        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                stock.decrementAndGet();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("최종 재고 = " + stock.get());
    }
}
