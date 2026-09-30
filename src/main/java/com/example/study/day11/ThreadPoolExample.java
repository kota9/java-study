package com.example.study.day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10 ; i++) {

            int taskNumber = i;

            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " -> 작업 " + taskNumber);
            });
        }

        executorService.shutdown();
    }
}
