package com.demo.polymorph.example2;
//So polymorphism is the ability (in programming) to
// present the same interface for differing underlying forms (data types).
public class FruitMain {

    public static void main(String[] args) {
        //Create apple, can't create Fruit apple, since it does not extend
        Apple apple = new Apple();
        apple.setColor("Red");
        System.out.println("Apple color is " + apple.getColor());
        System.out.println();

        Banana banana = new Banana();
        System.out.println("Hidden field from Parent: " + banana.getParentClassHiddenField());

        Fruit fruit = new Fruit();
        fruit.getBrandName(); // only fruit stuff is accesible
        fruit.rot();
        fruit = new Banana();
        fruit.rot();

    }
}
