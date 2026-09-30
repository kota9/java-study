package com.example.study.day11;

public class ThreadPractice {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println(
                    Thread.currentThread().getName()
                            + " 실행"
            );
        });

        thread.start();
    }
}
