package com.example.study.day13;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        CompletableFuture<String> productFuture =
                CompletableFuture.supplyAsync(() -> {
                    sleep(1000);
                    return "상품 정보";
                });

        CompletableFuture<String> couponFuture =
                CompletableFuture.supplyAsync(() -> {
                    sleep(1000);
                    return "쿠폰 정보";
                });

        CompletableFuture<String> recommendationFuture =
                CompletableFuture.supplyAsync(() -> {
                    sleep(1000);
                    return "추천 상품";
                });

        CompletableFuture.allOf(
                productFuture,
                couponFuture,
                recommendationFuture
        ).join();

        long end = System.currentTimeMillis();

        System.out.println(productFuture.join());
        System.out.println(couponFuture.join());
        System.out.println(recommendationFuture.join());

        System.out.println("실행 시간 : " + (end - start) + "ms");
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
