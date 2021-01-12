package com.demo.interfaces.example2;

public class RegularBankCustomer implements TelephoneContract, HouseLoan, CountryTaxContract {

    private int houseMonthlyPayment;
    private int phoneMonthlyPayment;
    private int countryTaxMonthlyPayment;

    public RegularBankCustomer(int houseMonthlyPayment, int phoneMonthlyPayment, int countryTaxMonthlyPayment) {
        this.houseMonthlyPayment = houseMonthlyPayment;
        this.phoneMonthlyPayment = phoneMonthlyPayment;
        this.countryTaxMonthlyPayment = countryTaxMonthlyPayment;
    }

    //House contract
    @Override
    public int payForHouse() {
        System.out.println("Regular Customer pays for House " + getHouseMonthlyPayment());
        return houseMonthlyPayment;
    }

    //Phone contract
    @Override
    public int payForPhone() {
        System.out.println("Regular Customer pays for Phone " + getPhoneMonthlyPayment());
        return phoneMonthlyPayment;
    }

    //Common taxes for everyone
    @Override
    public int payTaxesForCountry() {
        System.out.println("Regular Customer pays Taxes " + getCountryTaxMonthlyPayment());
        return countryTaxMonthlyPayment;
    }

    @Override
    public int overallTaxes() {
        return countryTaxMonthlyPayment + phoneMonthlyPayment + houseMonthlyPayment;
    }

    public int getHouseMonthlyPayment() {
        return houseMonthlyPayment;
    }

    public void setHouseMonthlyPayment(int houseMonthlyPayment) {
        this.houseMonthlyPayment = houseMonthlyPayment;
    }

    public int getPhoneMonthlyPayment() {
        return phoneMonthlyPayment;
    }

    public void setPhoneMonthlyPayment(int phoneMonthlyPayment) {
        this.phoneMonthlyPayment = phoneMonthlyPayment;
    }

    public int getCountryTaxMonthlyPayment() {
        return countryTaxMonthlyPayment;
    }

    public void setCountryTaxMonthlyPayment(int countryTaxMonthlyPayment) {
        this.countryTaxMonthlyPayment = countryTaxMonthlyPayment;
    }

    @Override
    public String toString() {
        return "RegularBankCustomer{" +
                "houseMonthlyPayment=" + houseMonthlyPayment +
                ", phoneMonthlyPayment=" + phoneMonthlyPayment +
                ", countryTaxMonthlyPayment=" + countryTaxMonthlyPayment +
                '}';
    }
}
