package com.demo.generics.example3;

import java.util.List;

public class Garage<T extends Vehicle> {

    private List<T> differentCars;

    public Garage(List<T> differentCars) {
        this.differentCars = differentCars;
    }

    public List<T> getDifferentCars() {
        return differentCars;
    }


    public void repairVehicle(Vehicle vehicle) {
        System.out.println("Reparing ... " + vehicle.color +" " +vehicle.brand + " car");
    }
}
