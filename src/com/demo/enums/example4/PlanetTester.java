package com.demo.enums.example4;

public class PlanetTester {
    public static void main(String[] args) {
        System.out.println(Planet.SATURN.toString());
        System.out.println(Planet.JUPITER.toString());
        System.out.println(Planet.PLUTO.toString());

        System.out.println();

        for(Planet planet : Planet.values()) {
            System.out.println(planet.name() + " distance from earth - " + planet.distance);
        }
    }
}
