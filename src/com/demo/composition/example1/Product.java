package com.demo.composition.example1;

public class Product {

    private String productName = "product";
    private int quantity = 1;
    private int pricePerPiece = 15;

    public Product() {
    }

    public Product(String productName, int quantity, int pricePerPiece) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerPiece = pricePerPiece;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPricePerPiece() {
        return pricePerPiece;
    }

    public void setPricePerPiece(int pricePerPiece) {
        this.pricePerPiece = pricePerPiece;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", pricePerPiece=" + pricePerPiece +
                '}';
    }
}
