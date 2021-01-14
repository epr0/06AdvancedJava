package com.demo.homework.atm;


import java.util.List;
import java.util.Scanner;

public class AccountMain {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        List<Account> existingAccounts = accountService.generateInitialAccounts();
        Scanner scanner = new Scanner(System.in);
        Account userAccount = null;
        while (true) {
            System.out.println("Enter account number: ");
            int enteredAccountNumber = scanner.nextInt();
            for (Account existingAccount : existingAccounts) {
                if(accountService.accountExists(existingAccount, enteredAccountNumber)) {
                    userAccount = existingAccount;
                }
            }

            if(userAccount == null) {
                System.out.println("Tokios paskyros nera. Ate");
                break;
            }


            System.out.println("Enter pin code number: ");
            int enteredPinCode = scanner.nextInt();
            if(accountService.login(userAccount, enteredPinCode)) {
                System.out.println("Prisijungta sekmingai!");
                break;
            } else {
                System.out.println("Blogas pin. Vis gero");
                userAccount = null;
                break;
            }

        }

        if(null != userAccount) {
            System.out.println("Welcome, " + userAccount.getFirstName() + " " + userAccount.getLastName());
            System.out.println("Your account balance is " + userAccount.getBalance());
            System.out.println("Your account number is " + userAccount.getAccountNumber());
            System.out.println("===========================================");
            System.out.println("Choose one the following operations >");
            System.out.println("1. Add money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
        }

    }
}
