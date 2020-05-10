package com.demo.lamda.advanced2;

import java.util.function.Function;

/**
 * A functional interface is an interface that contains only one abstract method.
 * They can have only one functionality to exhibit.
 * From Java 8 onwards, lambda expressions can be used to represent the
 *  instance of a functional interface.
 * A functional interface can have any number of default methods.
 */
public class FunctionInterfaceExample2 {

    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("ABCDE"));

        Function<String, String> replaceCommasWithDots = s -> s.replaceAll(",", ".");
        System.out.println(replaceCommasWithDots.apply("a,b,c"));
        System.out.println(replaceAll("a,b,c"));
    }

    private static String replaceAll(String word) {
        return word.replaceAll(",", ".");
    }
}