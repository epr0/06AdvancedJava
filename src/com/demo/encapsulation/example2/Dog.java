package com.demo.encapsulation.example2;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private int weight;

    public Dog() {
        //Default constructor
    }

    public Dog(String name, int age, String gender, String race, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(String gender, String race) {
        //Send DEFAULT values to the another class constructor
        this("Fido", 1, gender, race, 20);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !"".equals(name)) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender != null && !"".equals(gender)) {
            this.gender = gender;
        }
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        if (race != null && !"".equals(race)) {
            this.race = race;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
}
