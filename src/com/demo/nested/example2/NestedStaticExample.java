package com.demo.nested.example2;
public class NestedStaticExample {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(5);
        System.out.println(bicycle.getMaxSpeed());

        Bicycle.Mechanic mechanic = new Bicycle.Mechanic();
        mechanic.repair(bicycle);
        System.out.println(bicycle.getMaxSpeed());
    }
}