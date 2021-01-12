package com.demo.interfaces.example2;

public class RichBankCustomer implements BoatLoan {

    @Override
    public int payForBoat() {
        System.out.println("I am paying my boat loan with the interest rate of " + regularBoatInterestRate);
        return 100 + 100 * regularBoatInterestRate;
    }
}
