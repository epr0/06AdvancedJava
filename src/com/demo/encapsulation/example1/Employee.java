package com.demo.encapsulation.example1;

/*
Encapsulation
- Leidzia kontroliuoti duomenu prieinamuma
- Leidzia prideti papildomos logikos, kurios nematys vartotojas
- Pagerina programos kodo skaitomuma
 */
public class Employee {
    private int ssn;
    private String employeeName;
    private int employeeAge;

    public Employee() {
        //Default constructor
    }

    public Employee(String name, int age, int personalCode) {
        this.employeeName = name;
        this.employeeAge = age;
        this.ssn = personalCode;
    }

    //Getter and Setter methods
    public int getEmployeeSSN(){
        return ssn;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public int getEmployeeAge(){
        return employeeAge;
    }

    public void setEmployeeAge(int newAgeValue){
        employeeAge = newAgeValue;
    }

    public void growOlder() {
        employeeAge++;
    }

    public void setEmployeeName(String newEmployeeName){
        employeeName = newEmployeeName;
    }

    public void setEmployeeNameWithValidation(String newEmployeeName){
        if(newEmployeeName != null && !"".equals(newEmployeeName)) {
            this.employeeName = newEmployeeName;
        }
    }
    //Benefit: add specific logic to setter.
    //Benefit: remove setters, for entity to be read only.
    //Benefit: encapsulate, hide logic from the user.
    public void setEmployeeSSN(int newSsnValue){
        ssn = newSsnValue;
    }
}
