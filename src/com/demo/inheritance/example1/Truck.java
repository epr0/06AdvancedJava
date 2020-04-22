package com.demo.inheritance.example1;

public class Truck extends Vehicle {
    public Truck(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void setLicensePlate(String licensePlate) {
        super.setLicensePlate("TR".concat(licensePlate));
    }
}
