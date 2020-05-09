package com.demo.concurrency.advanced.example2;

public class ConcurrencyExercise1 implements Runnable {

    private int number;
    private boolean finished;

    public ConcurrencyExercise1(int number) {
        this.number = number;
        this.finished = false;
    }

    public void increaseNumber() {
        number++;
    }

    public void stopMe() {
        this.finished = true;
    }

    @Override
    public void run() {
        while(number <= 10 || !finished) {
            try {
                System.out.println("Hello " + number);
                increaseNumber();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}