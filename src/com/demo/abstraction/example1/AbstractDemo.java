package com.demo.abstraction.example1;

/*
-Abstract class can not be instantiated
-It has to be extended to be USED
-Abstract class might include abstract methods (without implementation);
-Fields,non abstract methods and static methods works the same way

ABSTRACT VS INTERFACE

When we talk about abstract classes we are defining characteristics of an object type;
specifying WHAT AN OBJECT IS.

When we talk about an interface and define capabilities that we promise to provide,
 we are talking about establishing a contract about WHAT AN OBJECT CAN DO.

 An abstract class can have shared state or functionality.
 An interface is only a promise to provide the state or functionality.
  A good abstract class will reduce the amount of code that has to be rewritten because it's
  functionality or state can be shared. The interface has no defined information to be shared
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Bank swedbank = new Swedbank();
        swedbank.deposit();
        swedbank.withdraw();
        swedbank.calculateSpecificBankTax();

        Bank seb = new SEB();
        seb.deposit();
        seb.withdraw();
        seb.calculateSpecificBankTax();

        Bank snoras = new Snoras();
        snoras.deposit();
        snoras.withdraw();
        System.out.println("Snoras fixed tax is " + BankInterface.fixedTax);

    }

}

abstract class Bank {
    public int commonBankTax = 5;

    public void deposit() {
        System.out.println("Common deposit method for all the banks.");
    }

    public void withdraw(){
        System.out.println("Common withdrawal method for all the banks");
    }

    abstract void calculateSpecificBankTax();
}

class Swedbank extends Bank {

    @Override
    void calculateSpecificBankTax() {
        System.out.println("Tax amount " + 15);
        System.out.println("Common bank tax applies: " + commonBankTax);

    }
}

class RandomBank extends Bank {

    @Override
    void calculateSpecificBankTax() {

    }
}

class SEB extends Bank {

    @Override
    void calculateSpecificBankTax() {
        System.out.println("Tax amount " + 17);
    }
}

class Snoras extends Bank implements BankInterface {

    @Override
    public void deposit() {
        System.out.println("Depositing in snoras and loosing money");
    }

    @Override
    public void withdraw() {
        System.out.println("Nothing to withdraw bank is broke");
    }

    //From the abstract class
    @Override
    void calculateSpecificBankTax() {
        System.out.println("Tax amount " + 0);
    }


}
