package com.demo.polymorph.example3;

public class HondaBike extends Bike {


    public HondaBike(Engine engine) {
        super(engine);
    }

    @Override
    public void ride() {
        System.out.printf("I dont have my own ride method so i use my parent class method - ");
        super.ride();
    }
}
