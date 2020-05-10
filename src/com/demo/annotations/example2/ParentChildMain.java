package com.demo.annotations.example2;


public class ParentChildMain {

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.doChildThings();
        child.doParentThings();
        child.doOldStuff();
    }
}
