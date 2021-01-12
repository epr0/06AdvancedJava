package com.demo.polymorph.example2;

public class Banana extends Fruit{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getParentClassHiddenField(){
        return super.brandName;
    }

    @Override
    public void rot() {
        System.out.println("rotting like a banana in 3 days");
    }
}
