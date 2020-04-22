package com.demo.polymorph.example1;

public class Football extends Ball {
    public Football(int weight) {
        super(weight);
    }

    @Override
    public String toString(){
        return "Football weight is: " + String.valueOf(super.getWeight());
    }

    public void doSomething(){
        System.out.println("Wooosh flying when kicked.");
    }
}
