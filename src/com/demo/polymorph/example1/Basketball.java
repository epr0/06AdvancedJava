package com.demo.polymorph.example1;

public class Basketball extends Ball {
    public Basketball(int weight) {
        super(weight);
    }

    @Override
    public String toString(){
        return "Basketball weight is: " + String.valueOf(super.getWeight());
    }
}
