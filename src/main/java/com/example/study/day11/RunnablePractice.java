package com.example.study.day11;

public class RunnablePractice {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Runnable 실행");
        };

        Thread thread = new Thread(task);

        thread.start();
    }
}
