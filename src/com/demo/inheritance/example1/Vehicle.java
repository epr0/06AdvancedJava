package com.demo.inheritance.example1;

public class Vehicle {
    private int maxSpeed;
    private String licensePlate = null;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void drive() {
        System.out.println("driving like a vehicle");
    }
}
