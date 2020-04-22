package com.demo.composition.services;

public class ProductService {
    private final EmailService emailService;

    public ProductService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendPurchaseCompletedEmail() {
        this.emailService.sendPurchaseCompletedEmail();
    }

    /*
    If we had used inheritance and one of our other subclasses
    had used this method but we wanted to remove it we would
    have been locked in, composition keeps things flexible.
     */

    public void sendDeliverySendEmail() {
        //We don't want to inherit here because Email does not make a nice subclass of Product.
        this.emailService.sendDeliverySendEmail();
    }

    public EmailService getEmailService() {
        return emailService;
    }
}
