package com.demo.collections3;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/*
Vector is very much similar to ArrayList, but with few differences,
firstly Vector is thread safe, where as Arraylist is not.
Secondly, Vector is synchronized, where as Arraylist is not,
So performance of Vector is low than ArrayList.
Vector increases its size by 100 % that is it doubles its size when total number of elements exceeds
its capacity whereas ArrayList increases by 50 % of current array size.
Vector can use Enumeration interface as well as Iterator to traverse over its elements.
Vector is a legacy Class, that is it is introduced before JDK 1.2.

Vector doubles its size when elements exceeds its initial capacity.
Vector can use both Enumeration as well as Iterator to traverse elements.
Vector is synchronized.
Vector is Thread Safe.
Vectors can be used for Multi Threading.
Vector is slow as compared to Array List.
 */

public class VectorTester {

    public static void main(String[] args) {
        System.out.println("Vector (Implements LIST interface as well, allows duplicates ");
        Vector<Integer> vectorOfIntegers = new Vector<>();
        vectorOfIntegers.add(2);
        vectorOfIntegers.add(1);
        vectorOfIntegers.add(3);
        vectorOfIntegers.add(3);

        System.out.println(Arrays.toString(vectorOfIntegers.toArray()));
        System.out.println();

        vectorOfIntegers.add(2, 123123);
        System.out.println("Newly added value at specific index" + Arrays.toString(vectorOfIntegers.toArray()));
        System.out.println("Vector capacity is: " + vectorOfIntegers.capacity());
    }
}
