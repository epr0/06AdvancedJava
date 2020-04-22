package com.demo.collections3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsTester {
	public static void main(String[] args) {
		
		/* 
		 * LIST - ordered collection of elements. 
		 * Elements can be accessed by their index. 
		 */
		System.out.println("LIST Implementations");
		System.out.println();
		System.out.print("ArrayList (Ordered - preserve order which they were added.) ");
		Collection<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.add(2);
		listOfIntegers.add(1);
		listOfIntegers.add(3);
		//List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1,2,3,4,5)); 
		System.out.print(Arrays.toString(listOfIntegers.toArray()));
		System.out.println();
		
		System.out.print("LinkedList (Implements LIST and DEQUE, allows duplicates, maintains insertion order) ");
		Collection<Integer> linkedListOfIntegers = new LinkedList<>();
		linkedListOfIntegers.add(2);
		linkedListOfIntegers.add(1);
		linkedListOfIntegers.add(3);
		System.out.print(Arrays.toString(linkedListOfIntegers.toArray()));
		System.out.println();
		
		System.out.print("Vector ");
		Collection<Integer> vectorOfIntegers = new ArrayList<>();
		vectorOfIntegers.add(2);
		vectorOfIntegers.add(1);
		vectorOfIntegers.add(3);
		System.out.print(Arrays.toString(vectorOfIntegers.toArray()));
		System.out.println();
		
		System.out.print("Stack ");
		Collection<Integer> stackOfIntegers = new ArrayList<>();
		stackOfIntegers.add(2);
		stackOfIntegers.add(1);
		stackOfIntegers.add(3);
		System.out.println(Arrays.toString(stackOfIntegers.toArray()));
		System.out.println();
		
		/* 
		 * SET - collection of sorted elements
		 * NO duplicates allowed
		 * Return elements in non predictable order
		 * 
		 */
		System.out.println("SET Implementations");
		System.out.println();
		
		Collection<String> setOfStrings = new HashSet<>();
		setOfStrings.add("Tom");
		setOfStrings.add("Avery");
		setOfStrings.add("Bob");
		System.out.print("HashSet ");
		System.out.print(Arrays.toString(setOfStrings.toArray()));
		System.out.println();
		
		Collection<String> linkedHashSetOfStrings = new LinkedHashSet<>();
		linkedHashSetOfStrings.add("Tom");
		linkedHashSetOfStrings.add("Avery");
		linkedHashSetOfStrings.add("Bob");
		System.out.print("LinkedHashSet ");
		System.out.print(Arrays.toString(linkedHashSetOfStrings.toArray()));
		System.out.println();
		
		Collection<String> treeSetOfStrings = new TreeSet<>();
		treeSetOfStrings.add("Tom");
		treeSetOfStrings.add("Avery");
		treeSetOfStrings.add("Bob");
		System.out.print("TreeSet ");
		System.out.print(Arrays.toString(treeSetOfStrings.toArray()));
		System.out.println();
		
		
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
		
		Map<String, Integer> linkedHashMapOfStrings = new LinkedHashMap<>();
		linkedHashMapOfStrings.put("Tom", 2);
		linkedHashMapOfStrings.put("Avery", 1);
		linkedHashMapOfStrings.put("Bob", 3);
		System.out.print("LinkedHashMap ");
		linkedHashMapOfStrings.forEach((key, value) -> System.out.print(key + " - " + value + " "));
		System.out.println();
		
		
		Map<String, Integer> treeMapOfStrings = new TreeMap<>();
		treeMapOfStrings.put("Tom", 2);
		treeMapOfStrings.put("Avery", 1);
		treeMapOfStrings.put("Bob", 3);
		System.out.print("TreeMap ");
		treeMapOfStrings.forEach((key, value) -> System.out.print(key + " - " + value + " "));
		System.out.println();
		
		
	}

}
