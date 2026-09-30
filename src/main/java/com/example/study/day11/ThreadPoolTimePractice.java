package com.example.study.day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTimePractice {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        long start = System.currentTimeMillis();

        for (int i = 1; i < 6; i++) {

            int taskNumber = i;

            executorService.submit(() -> {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(
                        "작업 " + taskNumber + " 완료"
                );
            });
        }

        /*그런데 여기에는 하나의 문제가 있다.
        shutdown()은 작업이 모두 끝날 때까지 기다리는 메서드가 아니다.
        그래서 제대로 시간을 측정하려면 awaitTermination() 같은 방법을 알아야 한다.
        오늘은 Thread 기본 학습이므로 여기까지 알고 넘어가도 충분하다.*/
        executorService.shutdown();

        long end = System.currentTimeMillis();

        System.out.println("요청 완료까지 걸린 시간: " + (end - start) + "ms");
    }
}
