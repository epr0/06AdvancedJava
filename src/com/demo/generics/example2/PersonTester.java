package com.demo.generics.example2;

public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Tom", 190);
        Person person2 = new Person(2, "Sam", 184);
        Person person3 = new Person(3, "Rob", 192);
        if(person1.compareTo(person2) == 1) {
            System.out.println(person1.name + " is taller than " + person2.name);
        } else {
            System.out.println(person2.name + " is taller than " + person1.name);
        }

        if(person2.compareTo(person3) == 1) {
            System.out.println(person2.name + " is taller than " + person3.name);
        } else {
            System.out.println(person3.name + " is taller than " + person2.name);
        }

        if(person1.compareTo(person3) == 1) {
            System.out.println(person1.name + " is taller than " + person3.name);
        } else {
            System.out.println(person3.name + " is taller than " + person1.name);
        }
    }
}
