package com.demo.polymorph.example3;

public class Engine {
    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public Engine(int enginePower) {
        this.enginePower = enginePower;
    }

    private int enginePower;


}
