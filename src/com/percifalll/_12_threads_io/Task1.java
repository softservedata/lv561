package com.percifalll._12_threads_io;

/**
 * Run three threads and output there different messages for 5 times.
 * The third thread supposed to start after finishing working of the two previous threads.
 */

public class Task1 {
    public static void main(String[] args) {
        Thread firstThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("First Thread is running");
                Thread.yield();
            }
        });
        Thread secondThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Second Thread running");
                Thread.yield();
            }
        });
        Thread thirdThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Third Thread running");
            }
        });

        firstThread.start();
        secondThread.start();

        while (true) {
            if (firstThread.getState() == Thread.State.TERMINATED
                    && secondThread.getState() == Thread.State.TERMINATED) {
                thirdThread.start();
                break;
            }
        }
    }
}
