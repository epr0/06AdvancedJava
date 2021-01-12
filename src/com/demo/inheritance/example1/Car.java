package com.demo.inheritance.example1;

public class Car extends Vehicle{

    //Iskvieciamas base klases konstruktorius
    //Car construktorius nieko pats nedaro
    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    public void carSpecificSound() {
        System.out.println("Garsas kaip CAR");
    }
}
