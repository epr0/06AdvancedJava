package com.demo.lamda;

import java.util.function.Function;

public class Example2 {

    public static void main(String[] args){
        // Method apply returns Integer and the type of the parameter is String
        Function<String, Integer> stringLengthFunction = s -> s.length();
        System.out.println(stringLengthFunction.apply("ABCDE"));

        // Method apply returns String and the type of the parameter is String
        Function<String, String> replaceCommasWithDotsFunction = s -> s.replace(',', '.');
        System.out.println(replaceCommasWithDotsFunction.apply("a,b,c"));
    }
}
