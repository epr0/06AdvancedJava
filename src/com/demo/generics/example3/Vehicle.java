package com.demo.generics.example3;

public class Vehicle {

    public String color;
    public String brand;

    public Vehicle(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
