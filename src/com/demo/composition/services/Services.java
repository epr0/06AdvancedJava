package com.demo.composition.services;

public class Services {
    public static final EmailService emailService = new EmailService();
    public static final ProductService productService = new ProductService(emailService);
}
