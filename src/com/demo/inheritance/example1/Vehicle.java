package com.demo.inheritance.example1;

public class Vehicle {
    private int maxSpeed;
    String licensePlate = null;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
