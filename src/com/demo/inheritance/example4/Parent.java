package com.demo.inheritance.example4;

public class Parent {

    public boolean isSmart = true;
    private boolean isSmoking = true;

    protected void singLikeAParent() {
        System.out.println("Singing like a parent");
    }

    public boolean isSmoking() {
        return isSmoking;
    }
}
