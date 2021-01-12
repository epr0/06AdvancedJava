package com.demo.inheritance.example4;

public class Child extends Parent {

    public String eyeColor = "Green";

    @Override
    protected void singLikeAParent() {
        super.singLikeAParent();
        System.out.println("Also sing like a child");
    }
}
