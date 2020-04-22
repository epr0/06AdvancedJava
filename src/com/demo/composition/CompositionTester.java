package com.demo.composition;

import com.demo.composition.services.Services;

public class CompositionTester {
    public static void main(String[] args) {
        Services.productService.sendPurchaseCompletedEmail();
        Services.productService.sendDeliverySendEmail();
        Services.emailService.sendPasswordConfirmationEmail();

    }
}
