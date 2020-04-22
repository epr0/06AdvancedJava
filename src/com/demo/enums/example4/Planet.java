package com.demo.enums.example4;

public enum Planet {
    JUPITER("small", 245151515),
    PLUTO("huge", 1000000),
    SATURN("normal", 82222222);

    String size;
    int distance;

    Planet(String size, int distance) {
        this.size = size;
        this.distance = distance;
    }

    @Override
    public String toString(){
        return this.size + " " + this.name();
    }

    public int distanceFromEarth() {
        return this.distance;
    }
}
