package com.demo.inheritance.example1;

public class CarMain {
    public static void main(String[] args) {
        //IS - A relationship.
        //Car IS-A Car
        Car car = new Car(200);
        car.setLicensePlate("HBC999");
        //Vehicle IS-A Car
        Vehicle vehicle = new Car(210);
        if(car instanceof Car){
            System.out.println("Car1 is a Car");
        }

        if(vehicle instanceof Vehicle){
            System.out.println("Vehicle1 is Vehicle");
        }

        if(car instanceof Vehicle){
            System.out.println("Car1 is a Vehicle");
        }

        if(vehicle instanceof Car){
            System.out.println("Vehicle1 is a Car");
        } else {
            System.out.println("Vehicle1 IS NOT a Car");
        }

        Truck truck = new Truck(90);
        truck.setLicensePlate("HBC888");

        Vehicle vehicle2 = truck;

        if(vehicle2 instanceof Car){
            System.out.println("Vehicle2 is a Car");
        } else {
            System.out.println("Vehicle2 is not a Car, because it is a TRUCK!");
        }

        //Inner classes for additional specific functionality
        Jeep jeep = new Jeep(150);
        Jeep.Trailer trailer = jeep.new Trailer();
        trailer.setColor("Black");
        jeep.setTrailer(trailer);
        jeep.setLicensePlate("BRG123");

    }
}
