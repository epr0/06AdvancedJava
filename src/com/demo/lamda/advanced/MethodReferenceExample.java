package com.demo.lamda.advanced;

import java.util.function.Predicate;

public class MethodReferenceExample {

    public static void main(String[] args) {
        Person person = new Person("Harry", "Potter", 22);

//        Predicate<Person> adultPersonTest = Person::isAdult;
        Predicate<Person> adultPersonTest1 = human -> human.isAdult();

//        adultPersonTest.test(person);
        System.out.println(adultPersonTest1.test(person));
    }
}
