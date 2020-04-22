package com.demo.collections2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoClass {
	
	public static void main(String[] args) {
		
		//both those array are fixed
		int values[] = new int[4]; //only have int values
		Object values1[] = new Object[4]; //we can have all kinds of objects here
		values1[0] = "Edvinas";
		values1[3] = 5;
		System.out.println(Arrays.toString(values1));
		
		Collection listOfNumbers = new ArrayList<>();
		listOfNumbers.add(3);
		listOfNumbers.add("Thomas");
		listOfNumbers.add(1.5);
		
		System.out.println(Arrays.toString(listOfNumbers.toArray()));
		
		//Enhanced for loop
		for(Object object : listOfNumbers) {
			System.out.println(object.toString());
		}
		
		System.out.println();
		
		List<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.add(5);
		listOfIntegers.add(8);
		listOfIntegers.add(1);
		
		System.out.println(Arrays.toString(listOfIntegers.toArray()));
		//we want to add 4 after 5;
		listOfIntegers.add(1, 4);
		System.out.println();
		System.out.println("Inserted element 4 into second INDEX");
		System.out.println(Arrays.toString(listOfIntegers.toArray()));
		Collections.sort(listOfIntegers);
		System.out.println();
		System.out.println("Sorted List");
		System.out.println(Arrays.toString(listOfIntegers.toArray()));
					
		
	}

}
