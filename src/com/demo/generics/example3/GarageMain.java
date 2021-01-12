package com.demo.generics.example3;

import java.util.Arrays;
import java.util.List;

public class GarageMain {

    public static void main(String[] args) {
        List<Vehicle> cars = Arrays.asList(new BMW("Red", "BMW"), new Audi("Green", "AUDI"));
        Garage garage = new Garage(cars);
        for (Vehicle car : cars) {
            garage.repairVehicle(car);
        }
    }
}
