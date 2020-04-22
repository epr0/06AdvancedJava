package com.demo.polymorph.example1;

public class Ball {
    private int weight;

    public Ball(int weight) {
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public String toString(){
        return "Ball weight is: " + getWeight();
    }


}
