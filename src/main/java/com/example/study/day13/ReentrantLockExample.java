package com.example.study.day13;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private static int stock = 1000;

    private static final Lock lock = new ReentrantLock();

    public static void decrease() {

        lock.lock();

        try {
            if (stock > 0) {
                stock--;
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                decrease();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2= new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("최종 재고 = " + stock);
    }
}
