package com.demo.inheritance.example4;

public class FamilyMain {

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.isSmart);
        System.out.println(parent.isSmoking());
        parent.singLikeAParent();

        Child child = new Child();
        child.singLikeAParent();
        System.out.println(child.isSmart);
        //child.isSmoking can't access. Do not one to inherit. Hide from child.
    }
}
