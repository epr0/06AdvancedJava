package com.demo.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //old good way for cycle
        for(Integer number : list) {
            System.out.println(number);
        }
        System.out.println();
        System.out.println("Lambda way");
        list.forEach(value -> System.out.println(value));
        System.out.println();
        System.out.println("Or even shorter way");
        list.forEach(System.out::println);



        List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println();
        System.out.println(collect); // [6, 7, 8, 9, 10]

    }
}
