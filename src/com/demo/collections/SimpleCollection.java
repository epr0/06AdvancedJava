package com.demo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SimpleCollection {

	public static void main(String[] args) {
		Integer[] values = new Integer[] { 1, 2, 3, 2, 1, 8 };

		// Good one to quickly print array values.
		System.out.println(Arrays.toString(values));

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(1);
		System.out.println(Arrays.toString(arrayList.toArray()));

		Collection<Object> objectCollection = new ArrayList<>();
		objectCollection.add(1);
		objectCollection.add("Tom");
		System.out.println(Arrays.toString(objectCollection.toArray()));

		Set<String> setOfStrings = new HashSet<>();
		setOfStrings.add("Edvinas");
		setOfStrings.add("Tomas");
		setOfStrings.add("Vladze");
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
