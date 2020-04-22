package com.demo.composition.example3;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Muzzle muzzle = new Muzzle();
        muzzle.setCold(false);
        muzzle.setColor("Black");
        muzzle.setRound(true);

        dog.setMuzzle(muzzle);

        System.out.println("Dog's muzzle is cold? - " + muzzle.isCold());
        System.out.println("Dog's muzzle is round? - " + muzzle.isRound());
        System.out.println("Dog's muzzle color is - " + muzzle.getColor());
    }
}
