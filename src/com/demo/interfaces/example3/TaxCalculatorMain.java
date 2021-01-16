package com.demo.interfaces.example3;

public class TaxCalculatorMain {

    public static void main(String[] args) {
        //this is concrete implementation
        TaxCalculator2020 taxCalculator = new TaxCalculator2020(500);

        //dependency injection
        //program against interface
        //this is poor mans di
        //usually we use frameworks like spring


        TaxReport taxReport = new TaxReport(new TaxCalculator2020(500));
        taxReport.show();

        //inject other depedency
        taxReport.setTaxCalculator(new TaxCalculator2021());
        taxReport.show();


    }
}
