package com.demo.annotations.example2;

public class ParentClass {

    public void doParentThings() {
        System.out.println("Acting like a parent...");
    }

    /**
    @Deprecated
    reason - we will not be using this anymore
     */
    @Deprecated()
    public void doOldStuff() {
        System.out.println("doing not needed things anymore");
    }
}
