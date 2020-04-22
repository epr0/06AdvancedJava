package com.demo.abstraction.example2;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car(240);
        //Vehicle can not be instantiated
        car.move();

        SportsCar sportsCar = new SportsCar(320);
        sportsCar.move();

        Vehicle anotherSportsCar = new SportsCar(325);
        Vehicle anotherCar = new Car(245);
        anotherCar.move();
        sportsCar.move();


    }
}
