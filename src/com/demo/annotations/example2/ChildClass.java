package com.demo.annotations.example2;

import java.util.List;

public class ChildClass extends ParentClass {

    public void doChildThings() {
        System.out.println("Doing child stuff...");
    }

    @Override
    public void doParentThings() {
        super.doParentThings();
        System.out.println("Also doing some other things...");
    }

}
