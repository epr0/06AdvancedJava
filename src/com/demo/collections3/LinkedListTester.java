package com.demo.collections3;

import java.util.*;

public class LinkedListTester {

    public static void main(String[] args) {
        System.out.println("LinkedList (Implements LIST and DEQUE, allows duplicates, maintains insertion order) ");
        List<String> names = new LinkedList<>();
        names.add("Viktor");
        names.add("Ola");
        names.add("Johan");
        names.add("Bosse");
        names.add("Thomas");
        names.add("Thomas");
        names.add("Thomas");
        names.add("Pontus");
        System.out.println();
        System.out.print("LinkedList before sort: " + Arrays.toString(names.toArray()));
        System.out.println();
        Collections.sort(names);
        System.out.println("LinkedList after sort: " + Arrays.toString(names.toArray()));
        System.out.println();

        System.out.println();

        List<Number> numbers = new LinkedList<>();
        numbers.add(123);
        numbers.add(3.14);
        numbers.add(29.88d);
        numbers.add(231515L);
        System.out.println("LinkedList of numbers: " + Arrays.toString(numbers.toArray()));

        LinkedList<Number> otherNumbers = new LinkedList<>();
        numbers.add(321);
        numbers.add(14.3);
        numbers.add(9.71d);
        numbers.add(12456L);

        otherNumbers.addAll(numbers);
        System.out.println("Two added LinkedLists: " + Arrays.toString(otherNumbers.toArray()));

        otherNumbers.addFirst(0.00001);
        otherNumbers.addLast(99999.99999);
        System.out.println("Added some numbeeeerrrrssss: " + Arrays.toString(otherNumbers.toArray()));

        LinkedList<Number> cloneList = (LinkedList<Number>) otherNumbers.clone();
        System.out.println("Cloned linked list: " + Arrays.toString(cloneList.toArray()));
        otherNumbers.clear();
        System.out.println("Cleared old list: " + Arrays.toString(otherNumbers.toArray()));

        Iterator iter = cloneList.listIterator(3);
        System.out.println("Started printing from 3!");
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("Finally, the size of the linked list is: " + cloneList.size());



    }


}
