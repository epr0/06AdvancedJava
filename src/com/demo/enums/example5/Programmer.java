package com.demo.enums.example5;

public enum Programmer {
    JUNIOR(1, 2000),
    MID(2, 2500),
    SENIOR(3, 3000),
    LEAD(5, 5000);

    int experience;
    int salary;

    Programmer(int experience, int salary) {
        this.experience = experience;
        this.salary = salary;
    }

    int getExperience() {
        return experience;
    }

    public int getSalary() {
        return salary;
    }
}
