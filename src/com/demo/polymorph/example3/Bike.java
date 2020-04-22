package com.demo.polymorph.example3;

public class Bike {

    private Engine engine;

    public Bike(Engine engine) {
        this.engine = engine;
    }

    public void ride() {
        System.out.println("Bike is riding with the engine power of " + engine.getEnginePower());
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


}
