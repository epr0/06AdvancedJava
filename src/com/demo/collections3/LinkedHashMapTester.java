package com.demo.collections3;

import java.util.LinkedHashMap;
import java.util.Map;

/*
LinkedHashMap is a type of Collection, which takes all the functionalities of HashMap class
i.e. it stores our data in a pair such that each element has a key associated with it.
As, HashMap does not maintains the insertion order, that is when we retrieve values from it we do not get that
values in the same order we have entered in it.

So, The functionality of maintaining the insertion is added into LinkedHashMap.
 To attain this  functionality all the entries(key and value) are linked to each other using doubly-linked list.
 This doubly-linked list maintains the iteration ordering,
 which is in general the order in which keys were added in  the map.
 */

public class LinkedHashMapTester {

    public static void main(String[] args) {

        Map<String, Integer> linkedHashMapOfStrings = new LinkedHashMap<>();
        linkedHashMapOfStrings.put("Tom", 2);
        linkedHashMapOfStrings.put("Avery", 1);
        linkedHashMapOfStrings.put("Bob", 3);
        System.out.print("LinkedHashMap ");
        linkedHashMapOfStrings.forEach((key, value) -> System.out.print(key + " - " + value + " "));
        System.out.println();

    }
}
