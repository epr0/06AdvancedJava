package com.demo.abstraction.example1;

/*
-Abstract class can not be instantiated
-It has to be extended to be USED
-Abstract class might include abstract methods (without implementation);
-Fields,non abstract methods and static methods works the same way
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
