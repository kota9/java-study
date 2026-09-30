package com.example.study.day11;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {

            Thread.sleep(1000);

            return 100 + 200;
        };

        Future<Integer> future = executorService.submit(task);

        System.out.println("작업 요청 완료");

        Integer result = future.get();

        System.out.println("결과: " + result);

        executorService.shutdown();
    }
}
