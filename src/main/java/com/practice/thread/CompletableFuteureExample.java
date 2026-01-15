package com.practice.thread;

import java.util.concurrent.CompletableFuture;

public class CompletableFuteureExample {
    public static void main(String[] args) {

        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                try {
                    Thread.sleep(500); // Simulate some work with sleep
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        CompletableFuture future1 = CompletableFuture.runAsync(task);
        CompletableFuture future2 = CompletableFuture.runAsync(task);
        CompletableFuture.allOf(future1, future2).join();

    }
}
