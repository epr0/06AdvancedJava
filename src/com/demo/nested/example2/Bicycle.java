package com.demo.nested.example2;

public class Bicycle {

    private int maxSpeed;

    public Bicycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static class Mechanic {
        public void repair(Bicycle bicycle) {
            bicycle.maxSpeed += 15;
        }
    }
}
