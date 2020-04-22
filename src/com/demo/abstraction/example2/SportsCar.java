package com.demo.abstraction.example2;

public class SportsCar extends Vehicle {

    public SportsCar(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Move very very fast like a sports car.... !!! WRUUUUM");
    }
}
