package com.demo.interfaces.example3;

//rule says
/*
The class should not worry about creating the calculator object instance
it should only USE IT

so we need to use DI
Constructor injection
setter injection
method injection
 */
public class TaxReport {
    //we are dependant and tightly coupled to this class
    //if calc changes the report class might be affected
    private TaxCalculator2020 taxCalculator2020;

    private TaxCalculator taxCalculator;



    //initialize field in constr
    //but here the argument acts like concrete implementation
    public TaxReport(TaxCalculator2020 taxCalculator2020) {
        this.taxCalculator = taxCalculator2020;
    }

    //so we need to be more flexible and allow to inject
    //any year implementation we want
    //this is Constructor injection of the dependency
    public TaxReport(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void show() {
        double tax = taxCalculator.calculateTax();
        System.out.println(tax);
    }
}
