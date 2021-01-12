package com.demo.enums.example5;

import java.util.EnumSet;

public class ProgrammerMain {

    public static <E> void main(String[] args) {
        System.out.println(Programmer.JUNIOR);
        System.out.println(Programmer.JUNIOR.getExperience());

        for (Programmer programmer : Programmer.values()) {
            System.out.println(programmer + " has years of experience " + programmer.getExperience());
        }

    }
}
