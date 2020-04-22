package com.demo;

public class EncapsulationFirst {

    public static void main(String[] args) {
        Person firstPerson = new Person();
        firstPerson.setId(1);
        firstPerson.setName("Bill");
        System.out.println(firstPerson.getId() + ". " + firstPerson.getName());
        Person secondPerson = firstPerson;
        firstPerson.setId(2);
        firstPerson.setName("Tom");
        System.out.println(firstPerson.getId() + ". " + firstPerson.getName());
    }
}

class Person {
    private String name;
    private int id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
