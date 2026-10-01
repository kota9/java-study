package com.example.study.day12;

import java.util.concurrent.atomic.AtomicInteger;

public class Day12Concurrency {

    static int stock = 100;
    static int syncStock = 100;
    static AtomicInteger atomicStock = new AtomicInteger(100);

    // Race Condition 발생
    static void decrease() {
        stock--;
    }

    // synchronized
    static synchronized void decreaseSync() {
        syncStock--;
    }

    // Atomic Integer
    static void decreaseAtomic() {
        atomicStock.decrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {

        Thread[] threads = new Thread[1000];

        // -------------------------
        // 1. Race Condition
        // -------------------------
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(Day12Concurrency::decrease);
            threads[i].start();
        }

        // join()은 해당 Thread가 끝날 때까지 현재 Thread가 기다리도록 합니다.
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Race Condition : " + stock);

        // -------------------------
        // 2. synchronized
        // -------------------------
        threads = new Thread[1000];

        for (int i = 0; i < 1000; i ++) {
            threads[i] = new Thread(Day12Concurrency::decreaseSync);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("synchronized : " + syncStock);

        // -------------------------
        // 3. AtomicInteger
        // -------------------------
        threads = new Thread[1000];

        for (int i = 0; i < 1000; i ++) {
            threads[i] = new Thread(Day12Concurrency::decreaseAtomic);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("AtomicInteger: " + atomicStock.get());
    }
}
