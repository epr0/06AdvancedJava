package com.demo.concurrency;

public class Example2 {
    public static void main(String[] args) {
        RunnableThread runnableThread = new RunnableThread();
        runnableThread.run();

        Runnable runnable = () -> { System.out.println("Lambda Runnable running"); };
        runnable.run();
    }
}

class RunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("My runnable is running!");
    }
}
