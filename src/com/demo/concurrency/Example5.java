package com.demo.concurrency;


public class Example5 {


    public static void main(String[] args) {
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
