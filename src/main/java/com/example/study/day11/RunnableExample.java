package com.example.study.day11;

public class RunnableExample {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Runnable 작업 실행");
        };

        Thread thread = new Thread(task);

        thread.start();
    }
}
