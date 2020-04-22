package com.demo.polymorph;

public class PolymorphismFirst {
    //SEB IS-A Bank
    //SEB IS-A Institution
    //SEB IS-A Object
    public static void main(String[] args) {
        //Upcasting
        Bank bank = new Swedbank();
        System.out.println(bank.getInterestRate());

        SEB sebBank = new SEB();
        sebBank.payGovernmentTax();

        SBank sBank = new SBank();
        sBank.giveLoans();

    }


}


class Bank {
    double getInterestRate() {
        return 0;
    }
}

class SEB extends Bank implements Institution {
    double getInterestRate() {
        return 5.5;
    }

    public void payGovernmentTax() {
        System.out.println("Paying tax 0.55");
    }
}

class Swedbank extends Bank implements Institution {
    double getInterestRate() {
        return 4.3;
    }

    public void payGovernmentTax() {
        System.out.println("Paying tax 0.43");
    }
}

class SBank extends Functions {

    void giveConsultations() {
        System.out.println("Giving SBAnk specific consultations");
    }
}

interface Institution {
    void payGovernmentTax();
}

abstract class Functions {
    void giveLoans() {
        System.out.println("giving loans as all of the banks");
    }

    abstract void giveConsultations();
}
