package com.demo.collections02;

public class Pomeranian implements Dog {
    @Override
    public void bark() {
        System.out.println("Bark bark");
    }

    public void doPeePeeALot(){
        System.out.println("doing lots of peepees..");
    }
}
