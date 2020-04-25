package com.demo.generics.example2;

public class Person implements Comparable<Person> {
    int id;
    String name;
    int height;

    Person(int id, String name, int height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    @Override
    public int compareTo(Person person) {
        if (height == person.height)
            return 0;
        else if (height > person.height)
            return 1;
        else
            return -1;
    }
}
