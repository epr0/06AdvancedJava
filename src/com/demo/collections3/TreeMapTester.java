package com.demo.collections3;

import java.util.Map;
import java.util.TreeMap;

/*
TreeMap also stores values based on the corresponding key.
 It stores only unique keys, that is duplicate keys are not allowed.
  Also it cannot store key as null but it can store null values.
   It is mostly similar to HashMap except it maintains natural order of keys.
If key is of integer type it arranges them in increasing order, or if they are of string type,
it arranges them in dictionary order.
 */

public class TreeMapTester {

    public static void main(String[] args) {
        Map<String, Integer> treeMapOfStrings = new TreeMap<>();
        treeMapOfStrings.put("Tom", 2);
        treeMapOfStrings.put("Avery", 1);
        treeMapOfStrings.put("Bob", 3);
        System.out.print("TreeMap ");
        treeMapOfStrings.forEach((key, value) -> System.out.print(key + " - " + value + " "));
        System.out.println();
    }
}
