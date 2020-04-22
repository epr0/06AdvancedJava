package com.demo.abstraction.example2;

public class Car extends Vehicle {

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Car moved... wrummm...");
    }
}
