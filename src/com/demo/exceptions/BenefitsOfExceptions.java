package com.demo.exceptions;

/*
The Exception Handling in Java is one of the powerful mechanism
to handle the runtime errors so that normal
flow of the application can be maintained.

An exception is thrown when and only when
function preconditions (assumptions about arguments) are broken!

Because they're things that will happen normally. Exceptions are not control flow mechanisms.
 Users often get passwords wrong, it's not an exceptional case.
  Exceptions should be a truly rare thing, UserHasDiedAtKeyboard type situations.

  So we don't need to throw InputIncorrectException
  Or AgeTooYoungException.

  Those situations are not exceptions. (isimtys)
  Exception is a rare thing which is not anticipated but might happen.
  My little guidelines are heavily influenced by the great book "Code complete":

Use exceptions to notify about things that should not be ignored.
Don't use exceptions if the error can be handled locally
Make sure the exceptions are at the same level of abstraction as the rest of your routine.
Exceptions should be reserved for what's truly exceptional.

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
