package com.demo.composition.example4;

/*
Person class is not affected by the changes in JOB class
We can add extra changes here, but Person class, who is using JOB
object within a composition will continue using it without any impact
 */
public class Job {
    private String role;
    private long salary;
    private int id;

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


}