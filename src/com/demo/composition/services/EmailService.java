package com.demo.composition.services;

public class EmailService {
    public void sendPasswordConfirmationEmail(){
        System.out.println("Password confirmation sent");
    }

    public void sendPurchaseCompletedEmail() {
        System.out.println("Your purchase is completed");
    }

    public void sendDeliverySendEmail() {
        System.out.println("Delivery is on the way!");
    }
}
