package com.demo.streams;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindExample {

    private static final Logger logger = Logger.getLogger(FindExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");

        List<String> namesCopy1 = new ArrayList<>(names);
        List<String> namesCopy2 = new ArrayList<>(names
                .stream()
                .collect(Collectors.toList())
        );

//        Why it won't work this way?
//        String firstName = names.stream().findFirst();

        Optional<String> firstName = names.stream().findAny();
        System.out.println(String.format("First name: %s", firstName.orElse("list was empty")));
    }
}