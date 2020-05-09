package com.demo.lamda;

import java.util.function.Predicate;

//Predicate represents a predicate, which is boolean-valued function, of one argument.
public class Example1 {

    public static void main(String[] args) {
        Predicate<String> startsWithABCTest = s -> s.startsWith("ABC");
        System.out.println(startsWithABCTest.test("ABCDEF"));

        Predicate<Integer> integerPredicate = new MyPredicate();
        System.out.println(integerPredicate.test(10));

    }
}

class MyPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer > 5;
    }
}
