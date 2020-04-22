package com.demo.polymorph.example3;

public class YamahaBike extends Bike {
    public YamahaBike(Engine engine) {
        super(engine);
    }

    @Override
    public void ride() {
        System.out.println("Yamaha bike is riding with the engine power of " + super.getEngine().getEnginePower());
    }
}
