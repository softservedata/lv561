package com.percifalll._12_threads_io;

/**
 * Cause a deadlock.
 * Organize the expectations of ending a thread in main(),
 * and make the end of the method main() in this thread.
 */

public class Task2 {
    public static final Object one = new Object();
    public static final Object two = new Object();

    public static void main(String[] args) {


        synchronized (one){
            new CustomThread().start();
            try{ Thread.sleep(10); }
            catch (Exception exception) { exception.printStackTrace(); }
            synchronized (two){
                System.out.println("Main completed");
            }
        }
        new CustomThread().start();

    }

    public static class CustomThread extends Thread{
        @Override
        public void run() {
            synchronized (two){
                try{ Thread.sleep(10); }
                catch (Exception exception) { exception.printStackTrace(); }
                synchronized (one){
                    System.out.println("Thread completed");
                }
            }
        }
    }
}
