package com.example.study.day11;

public class ThreadExample {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("새로운 Thread 실행");
        });

        thread.start();

        System.out.println("main Thread 실행");
    }
}