package com.demo.collections3;

import java.util.HashMap;
import java.util.Map;

/*
HashMap is a class that implements Map Interface and Extends AbstractMap class.
 HashMap stores our data in a pair such that each element has a key associated with it.

It is generally denoted as HashMap <key, value> or HashMap <K,V>.
 */

public class HashMapTester {

    public static void main(String[] args) {
        /*
         * MAP - key value pairs, keys should be immutable.
         * NO duplicate keys allowed.
         */

        System.out.println();
        System.out.println("MAP Implementations");
        System.out.println();

        Map<String, Integer> mapOfStrings = new HashMap<>();
        mapOfStrings.put("Tom", 2);
        mapOfStrings.put("Avery", 1);
        mapOfStrings.put("Bob", 3);
        System.out.print("HashMap ");
        mapOfStrings.forEach((key, value) -> System.out.print(key + " - " + value + " "));
        System.out.println();
    }


}
