package com.demo.homework.atm;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class AccountService {

    public boolean accountExists(Account account, int enteredAccountNumber) {
        return account.getAccountNumber() == enteredAccountNumber;
    }

    public boolean login(Account account, int userInput) {
        account.setLastUsageDate(LocalDate.now());
        return account.getPinCode() == userInput;
    }

    public List<Account> generateInitialAccounts() {
        return Arrays.asList(
                new Account("Tom", "James", 50, 123, 111, LocalDate.now()),
                new Account("Mo", "Malone", 30, 321, 222, LocalDate.now())
        );
    }

    public void addMoney(Account account, double moneyToAdd) {
        if(moneyToAdd < 0) {
            System.out.println("Negative cannot be added");
        } else {
            account.setBalance(account.getBalance() + moneyToAdd);
            System.out.println("Money added.");
        }
    }

    public void withdrawMoney(Account account, double moneyToWithdraw) {
        if(moneyToWithdraw < 0) {
            moneyToWithdraw = moneyToWithdraw * -1;
        }

        if(account.getBalance() > moneyToWithdraw) {
            account.setBalance(account.getBalance() - moneyToWithdraw);
            System.out.println("Money withdrawn.");
        } else {
            System.out.println("You don't have that much money.");
        }
    }
}
