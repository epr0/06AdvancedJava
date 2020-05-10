package com.demo.concurrency.advanced.advanced3;

public class ThreadTest {

    public static void main(String[] args) {
        NiceThread t1 = new NiceThread(0, 3, 300);
        NiceThread t2 = new NiceThread(1, 3, 300);
        NiceThread t3 = new NiceThread(2, 3, 300);

        t1.start();
        t2.start();
        t3.start();
    }
}
