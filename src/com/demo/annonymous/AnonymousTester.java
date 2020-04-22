package com.demo.annonymous;

public class AnonymousTester {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.startEngine();

        Car bmw = new Car() {
            @Override
            public void startEngine() {
                System.out.println("Engine is on! Wroooooooooom");
            }
        };

        bmw.startEngine();
    }


}

class Car {
    public void startEngine() {
        System.out.println("Engine is on, wrooom!");
    }
}
