package com.demo.lamda.advanced4;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        UnaryOperator<Integer> toSquareUnaryOperator = i -> i * i;
        System.out.println(toSquareUnaryOperator.apply(5));
    }
}
