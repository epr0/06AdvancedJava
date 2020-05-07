package com.demo.collections;

import java.util.*;

public class SimpleCollection {

	public static void main(String[] args) {
		Integer[] values = new Integer[] { 1, 2, 3, 2, 1, 8 };

		// Good one to quickly print array values.
		System.out.println(Arrays.toString(values));

		//bad practice
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(1);
		System.out.println(Arrays.toString(arrayList.toArray()));

		//Program to an interface, not to a concrete implementation OO principle
		//To decouple your code from a specific implementation of the interface.
		//list is an interface which arraylist implements, so it gives more flex.
		List<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.add(4);
		listOfIntegers.add(5);

		//so later you can change the implementation of your list
		//can
		listOfIntegers = new LinkedList<>();
		//can't
		//arrayList = new LinkedList<>();

		Collection<Object> objectCollection = new ArrayList<>();
		objectCollection.add(1);
		objectCollection.add("Tom");
		objectCollection.add(5);
		objectCollection.add("Harry");
		objectCollection.add(true);
		System.out.println(Arrays.toString(objectCollection.toArray()));

		Set<String> setOfStrings = new HashSet<>();
		setOfStrings.add("Edvinas");
		setOfStrings.add("Tomas");
		setOfStrings.add("Vladze");
		setOfStrings.add("Edvinas");
		setOfStrings.add("Peter");
		setOfStrings.add("Tomas");
		System.out.println(Arrays.toString(setOfStrings.toArray()));

		System.out.println("Ordered automatically since it is a SET");
		Set<Integer> setOfIntegers = new TreeSet<>();
		setOfIntegers.add(5);
		setOfIntegers.add(7);
		setOfIntegers.add(1);
		System.out.println(Arrays.toString(setOfIntegers.toArray()));
		setOfIntegers = new HashSet<>();
		setOfIntegers.add(5);
		setOfIntegers.add(7);
		setOfIntegers.add(1);
		setOfIntegers.add(8);
		System.out.println(Arrays.toString(setOfIntegers.toArray()));
		System.out.println();

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Edvinas");
		map.put(3, "Vladas");
		map.put(2, "Donatas");
		System.out.println("Ordered automatically");
		map.forEach((key, value) -> System.out.println(key + ":" + value));
		System.out.println();

		Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		map2.put(1, "Edvinas");
		map2.put(3, "Vladas");
		map2.put(2, "Donatas");
		System.out.println("Preserved Insertion Order");
		map2.forEach((key, value) -> System.out.println(key + ":" + value));
		System.out.println();

		// using for-each loop for iteration over Map.entrySet()
		for (Map.Entry<Integer, String> entry : map2.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

	}

}
