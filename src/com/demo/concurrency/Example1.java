package com.demo.concurrency;

/*
Main difference is that when program calls start() method a new Thread is created
and code inside run() method is executed in new Thread while if you call run()
method directly no new Thread is created and code inside run() will execute on current Thread.M
 */
public class Example1 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");
        Thread.sleep(5000);
        System.out.println("Main thread is still running");
        Thread.sleep(5000);
        System.out.println("Main thread ends");

    }
}
