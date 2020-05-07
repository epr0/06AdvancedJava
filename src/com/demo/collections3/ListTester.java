package com.demo.collections3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTester {

    public static void main(String[] args) {

        /*
         * LIST - ordered collection of elements.
         * Elements can be accessed by their index.
         */
        System.out.println("LIST Implementations");
        System.out.println();
        System.out.print("ArrayList (Ordered - preserve order which they were added.) ");
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(2);
        listOfIntegers.add(1);
        listOfIntegers.add(3);
        listOfIntegers.add(6);
        listOfIntegers.add(6);
        listOfIntegers.add(5);
        System.out.println();
        System.out.print("Initial values: ");
        listOfIntegers.forEach(value -> System.out.print(value + " "));
        Collections.sort(listOfIntegers);
        //List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1,2,3,4,5))
        System.out.println();
        listOfIntegers.set(0, 555);
        listOfIntegers.remove(4);
        System.out.print("After sort, updating and removing: ");
        System.out.println(Arrays.toString(listOfIntegers.toArray()));
        System.out.println("List contains number 3? - " + listOfIntegers.contains(3));
        System.out.println();
        System.out.println("Max value of the list is - " + Collections.max(listOfIntegers));
        System.out.println("Min value of the list is - " + Collections.min(listOfIntegers));
        System.out.println();
        Collections.sort(listOfIntegers, Collections.reverseOrder());
        System.out.print("After reverse sort, list looks like this: " + listOfIntegers);
    }
}
