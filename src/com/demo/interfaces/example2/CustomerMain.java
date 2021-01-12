package com.demo.interfaces.example2;

public class CustomerMain {

    public static void main(String[] args) {
        RegularBankCustomer regularBankCustomer =
                new RegularBankCustomer(300,50,1000);

        System.out.println(regularBankCustomer);
        System.out.println("Overall regular customer taxes - " + regularBankCustomer.overallTaxes());
    }
}
