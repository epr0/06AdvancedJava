package com.demo.lamda.advanced3;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * The Supplier Interface is a part of the java. util.
 * function package which has been introduced since Java 8,
 * to implement functional programming in Java.
 * It represents a function which does not take
 * in any argument but produces a value of type T.
 */
public class SupplierConsumerExample {

    public static void main(String[] args) {
        Supplier<Double> randomNumberSupplier = () -> new Random().nextDouble();
        double randomNumber = randomNumberSupplier.get();
        System.out.println(randomNumber);

        Consumer<Double> printWithPrefixConsumer = d -> System.out.println("Value: " + d);
        printWithPrefixConsumer.accept(10.5);
    }
}