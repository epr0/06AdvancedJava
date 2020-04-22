package com.demo.encapsulation.example1;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeName("Mario");
        employee.setEmployeeAge(25);
        employee.setEmployeeSSN(123123123);
        System.out.println("Darbuotojo vardas: " + employee.getEmployeeName());
        System.out.println("Darbuotojo amzius: " + employee.getEmployeeAge());
        System.out.println("Darbuotojo kodas:  " + employee.getEmployeeSSN());

        System.out.println();

        Employee otherEmployee = new Employee("Thomas", 30, 95659565);
        System.out.println("Darbuotojo vardas: " + otherEmployee.getEmployeeName());
        System.out.println("Darbuotojo amzius: " + otherEmployee.getEmployeeAge());
        System.out.println("Darbuotojo kodas:  " + otherEmployee.getEmployeeSSN());

        System.out.println();
        otherEmployee.setEmployeeNameWithValidation("");
        otherEmployee.growOlder();
        System.out.println("Pakeistas Darbuotojo vardas: " + otherEmployee.getEmployeeName());
        System.out.println("Pakeistas Darbuotojo amzius: " + otherEmployee.getEmployeeAge());

    }
}
