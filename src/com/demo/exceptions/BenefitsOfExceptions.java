package com.demo.exceptions;

/*
The Exception Handling in Java is one of the powerful mechanism
to handle the runtime errors so that normal
flow of the application can be maintained.
 */
public class BenefitsOfExceptions {
    public static void main(String[] args) {
        System.out.println(calculatePercentage(10,5));
        System.out.println(addPercentages(10,0, 10, 0));
        System.out.println(calculatePercentageWithException(10,0));
    }

    private static double calculatePercentage(int a, int b) {
        if(b == 0) {
            return -1; //error code
        } else {
            return 100.0 * (a / b);
        }
    }

    private static double addPercentages(int a, int b, int c, int d) {
        double percentage1 = calculatePercentage(a, b);
        double percentage2 = calculatePercentage(c, d);
        return percentage1 + percentage2;
    }

    private static double calculatePercentageWithException(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Second argument cannot be zero");
        } else {
            return 100.0 * (a / b);
        }
    }
}
