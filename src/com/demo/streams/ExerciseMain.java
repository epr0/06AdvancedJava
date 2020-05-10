package com.demo.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseMain {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> numbers = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

        names = names.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted names: " + names);

        numbers = numbers.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted numbers: " + numbers);

        names.stream()
                .filter(name -> name.startsWith("E"))
                .forEach(System.out::println);

        numbers.stream()
                .filter(number -> number > 30 && number < 200)
                .forEach(System.out::println);

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        names.stream()
                .map(name -> name.substring(1, name.length() - 1))
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        names.stream()
                .sorted((name1, name2) -> name2.compareTo(name1))
                .forEach(System.out::println);
    }
}