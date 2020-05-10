package com.demo.streams;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class ForEachAndSortExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");
        names.forEach(System.out::println);

        List<Person> people = Arrays.asList(
                new Person("John", "Smith", 20),
                new Person("Sarah", "Connor", 30)
        );

        people.stream()
                .sorted((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()))
                .forEach(person -> System.out.println(person.getLastName()));
    }
}

class Person {
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}