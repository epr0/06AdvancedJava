package com.demo.concurrency;

public class SyncDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    counter.increase();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    counter.increase();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join(); //Asks main thread to wait for t1, because t1 can execute the line below
        //without waiting for t1 to finish running the loop 1000 times.
        t2.join();

        System.out.println("count " + counter.count);
    }
}

class Counter {
    int count;

    public synchronized void increase() {
        count++;
    }
}
