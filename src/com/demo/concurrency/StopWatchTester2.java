package com.demo.concurrency;

public class StopWatchTester2 {

    public static void main(String[] args) {
        StopWatchThread stopWatchThread1 = new StopWatchThread("SW1");
        StopWatchThread stopWatchThread2 = new StopWatchThread("SW2");

        stopWatchThread1.start();
        stopWatchThread2.start();

        System.out.println("Main thread starts");
        try {
            Thread.sleep(2000);
            System.out.println("Main thread is still running");
            Thread.sleep(3000);
            System.out.println("Main thread ends");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted on sleep");
        }
    }
}
