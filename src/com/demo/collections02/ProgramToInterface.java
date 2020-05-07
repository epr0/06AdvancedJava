package com.demo.collections02;

import java.util.ArrayList;
import java.util.List;

public class ProgramToInterface {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(); //program to interface
        //this first declaration ensures that that you use the methods
        //which are only defined by List (no specific arrayList methods)

        //Programming to an interface is saying,
        // "I need this functionality and I don't care where it comes from."
        ArrayList<String> myArrayList = new ArrayList<>(); //program to concrete class


    }
}
