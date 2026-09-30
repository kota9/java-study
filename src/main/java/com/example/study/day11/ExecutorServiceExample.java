package com.example.study.day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(() -> {
            System.out.println("작업 1");
        });

        executorService.execute(() -> {
            System.out.println("작업 2");
        });

        executorService.execute(() -> {
            System.out.println("작업 3");
        });

        executorService.shutdown();
    }
}
