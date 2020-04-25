package com.demo.exceptions;

/*
statement 1;
statement 2;
statement 3;
statement 4;
statement 5;//exception occurs
statement 6;
statement 7;
statement 8;
statement 9;
statement 10;
 */
public class ExceptionTester2 {
    public static void main(String[] args) {
        System.out.println("Program started...");
        try {
            System.out.println("Doing some calculations...");
            int x = 5 / 0;
        } catch (Exception e) {
            System.out.println("<Exception is caught and handled.>");
        } finally {
            System.out.println("This will be printed no matter what");
        }

        System.out.println("Moving further...");

        doSameThingWithoutException();

    }

    private static void doSameThingWithoutException() {
        System.out.println("Program started...");
        System.out.println("Doing some calculations...");
        int x = 5 / 0;

        System.out.println("<Exception is caught and handled.>");

        System.out.println("This will be printed no matter what");

        System.out.println("Moving further...");
    }
}
