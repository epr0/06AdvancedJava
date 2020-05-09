package com.demo.concurrency;

public class Example3 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<10; i++){
            new Thread("" + i){
                public void run(){
                    System.out.println("Thread: " + getName() + " running");
                }
            }.start();
        }


        System.out.println("Number of active threads from the given thread: " + Thread.activeCount());
    }
}
