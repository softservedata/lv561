package com.percifalll._12_threads_io;

/**
 * Create a thread «one»,
 * which would start the thread «two»,
 * which has to output its number («Thread number two») 3 times
 * and create thread «three»,
 * which would to output message «Thread number three» 5 times.
 */

public class Task3 {
    public static void main(String[] args) {
        Thread one = new Thread(()->{


            Thread two = new Thread(() -> {
                for (int i = 0; i < 3; i++){
                    System.out.println("Thread number 2");
                }


                Thread three = new Thread(()->{
                   for (int i = 0; i < 5; i++){
                       System.out.println("Thread number 3");
                   }
                });
                three.start();


            });
            two.start();

        });
        one.start();
    }
}
