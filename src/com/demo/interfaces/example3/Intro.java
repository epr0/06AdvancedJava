package com.demo.interfaces.example3;

/*
we use interfaces to build loosely coupled,
extensible, testable applications.

eg. Car, it's parts are loosely coupled.
If engine breaks, we change it and don't change the tires

So if a class is dependant on other class. Changes might be needed
to be applied in both classes if something changes.

We want to avoid that or at least reduce the changes to the minimum.

Interface is type of a class, but includes only method declarations
No implementations.

Eg. in restaurant you dont know how is the cheff. you just care to get food.
So if the cheff changes, you don't care as long you get your pizza as ordered.

Interface - what should be done (contract)
Class - how it should be done
 */
public interface Intro {

    //can have public static fields with predefined values
    //and you cant change the value once it is set


}
