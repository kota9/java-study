package com.example.study.day13;

public class VolatileExample {

    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            System.out.println("작업 시작");

            while (running) {
                // 작업 수행
            }

            System.out.println("작업 종료");
        });

        worker.start();

        Thread.sleep(1000);

        System.out.println("running = false");
        running = false;
    }
}
