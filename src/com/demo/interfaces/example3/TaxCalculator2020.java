package com.demo.interfaces.example3;

public class TaxCalculator2020 implements TaxCalculator {

    private double taxableIncome;

    public TaxCalculator2020(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override //best practice to add annotation
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
