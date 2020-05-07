package com.demo.collections3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
HashSet is the implementation of Set Interface which uses Hash table for storing the data.
Hash table internally uses a phenomena known as hashing,
 Hash set does not maintains the insertion order,
 that is when we retrieve values from it  we do not get that values in the same order as we have entered in it.
 */
public class HashSetTester {

    public static void main(String[] args) {
        /*
         * SET - collection of sorted elements
         * NO duplicates allowed
         * Return elements in non predictable order
         *
         */
        System.out.println("SET Implementations");
        System.out.println();

        Set<String> setOfStrings = new HashSet<>();
        setOfStrings.add("Tom");
        setOfStrings.add("Avery");
        setOfStrings.add("Bob");
        System.out.print("HashSet ");
        System.out.print(Arrays.toString(setOfStrings.toArray()));
        System.out.println();
    }
}
