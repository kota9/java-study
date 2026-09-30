package com.example.study.day11;

import java.util.concurrent.*;

public class FuturePractice {

    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<Integer> task = () -> {

            Thread.sleep(1000);

            return 100;
        };

        Future<Integer> future = executorService.submit(task);

        System.out.println("계산 요청");

        Integer result = future.get();

        System.out.println("계산 결과: " + result);

        executorService.shutdown();
    }
}
