package com.demo.collections3;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
LinkedHashSet is also the implementation of Set Interface.
It is almost similar to hashset, but it maintains insertion order i.e. values are retrieved
in the same order in which they are added. It uses doubly linked list to obtain this functionality.
 */

public class LinkedHashSetTester {

    public static void main(String[] args) {
        Set<String> linkedHashSetOfStrings = new LinkedHashSet<>();
        linkedHashSetOfStrings.add("Tom");
        linkedHashSetOfStrings.add("Avery");
        linkedHashSetOfStrings.add("Bob");
        System.out.print("LinkedHashSet ");
        System.out.print(Arrays.toString(linkedHashSetOfStrings.toArray()));
        System.out.println();
    }
}
