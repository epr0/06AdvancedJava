package com.demo.collections3;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
TreeSet  also implements Set Interface, it is also similar to hashset ,
but it stores all the elements in their natural order ,
like all integer values are stored in ascending order
and strings are stored according to Dictionary values.

Apart from adding this functionality of maintaining natural ordering, TreeSet do not allow null values.

TreeSet is best choice for storing large amount of data, as its retrieval and access time is very fast,
which makes data to be found in no time.
 */

public class TreeSetTester {

    public static void main(String[] args) {

        Set<String> treeSetOfStrings = new TreeSet<>();
        treeSetOfStrings.add("Tom");
        treeSetOfStrings.add("Avery");
        treeSetOfStrings.add("Bob");
        System.out.print("TreeSet ");
        System.out.print(Arrays.toString(treeSetOfStrings.toArray()));
        System.out.println();
    }
}
