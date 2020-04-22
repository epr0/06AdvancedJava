package com.demo.concurrency;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Hi hi = new Hi();
        Hello hello = new Hello();

        hi.start();
        hello.start();

    }
}

class Hi extends Thread{
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(550);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread{

    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
