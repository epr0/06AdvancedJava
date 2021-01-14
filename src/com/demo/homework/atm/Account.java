package com.demo.homework.atm;

import java.time.LocalDate;

public class Account {

    private String firstName;
    private String lastName;
    private double balance;
    private int accountNumber;
    private int pinCode;
    private LocalDate lastUsageDate;

    public Account(String firstName, String lastName, double balance, int accountNumber, int pinCode, LocalDate lastUsageDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.lastUsageDate = lastUsageDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public LocalDate getLastUsageDate() {
        return lastUsageDate;
    }

    public void setLastUsageDate(LocalDate lastUsageDate) {
        this.lastUsageDate = lastUsageDate;
    }
}
