package com.demo.polymorph.example2;

public class Fruit {
    protected String brandName = "Cool brand";

    public String getBrandName() {
        return brandName;
    }

    public void rot() {
        System.out.println("rotting like a regular fruit in 5 days");
    }

}
