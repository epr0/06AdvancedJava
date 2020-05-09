package com.demo.concurrency.advanced.example2;

public class Exercise1Main {

    public static void main(String[] args) {
        ConcurrencyExercise1 obj1 = new ConcurrencyExercise1(1000);
        new Thread(obj1).start();

        ConcurrencyExercise1 obj2 = new ConcurrencyExercise1(100);
        new Thread(obj2).start();
        obj1.stopMe();

        ConcurrencyExercise1 obj3 = new ConcurrencyExercise1(1);
        new Thread(obj3).start();
        obj2.stopMe();
        obj3.stopMe();
    }
}