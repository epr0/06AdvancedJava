package com.demo.homework.atm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {

    Account account;
    AccountService accountService;

    @BeforeEach
    void setUp() {
        account =
                new Account("TOM", "MOT", 50, 123, 321, LocalDate.now());
        accountService = new AccountService();

    }
    @Test
    void loginWithCorrectPinCode() {
        int userInput = 321;

        boolean isLoggedIn = accountService.login(account, userInput);

        assertTrue(isLoggedIn);
    }

    @Test
    void loginWithInCorrectPinCode() {
        int userInput = 789;

        boolean isLoggedIn = accountService.login(account, userInput);

        assertFalse(isLoggedIn);
    }

    @Test
    void generateInitialAccounts() {
        List<Account> actualAccounts = accountService.generateInitialAccounts();
        assertEquals(2, actualAccounts.size());
    }

    @Test
    void addMoneyPositive() {

        accountService.addMoney(account, 30);

        assertEquals(80, account.getBalance());
    }

    @Test
    void addMoneyNegative() {
        accountService.addMoney(account, -30);

        assertEquals(50, account.getBalance());
    }

    @Test
    void withdrawMoneyPositive() {
        accountService.withdrawMoney(account, 20);

        assertEquals(30, account.getBalance());
    }
    @Test
    void withdrawMoneyNegative() {
        accountService.withdrawMoney(account, -40);

        assertEquals(10, account.getBalance());
    }

}