package com.demo.polymorph.example3;

import java.util.ArrayList;
import java.util.List;

public class BikeMain {

    public static void main(String[] args) {
        List<Bike> listOfBikes = new ArrayList<Bike>();
        listOfBikes.add(new HondaBike(new Engine(10)));
        listOfBikes.add(new YamahaBike(new Engine(15)));

        for(Bike bike : listOfBikes) {
            bike.ride();
        }

    }
}
