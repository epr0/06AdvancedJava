package com.demo.encapsulation.example3;

public class PocketMain {
    public static void main(String[] args) {
        Pocket pocket = new Pocket(50);
        System.out.println("Kiseneje yra: " + pocket.showMoney() + " euriuku.");
        pocket.setMoney(50);
        pocket.setMoney(-5);
        pocket.setMoney(3001);
        System.out.println("Kiseneje yra: " + pocket.showMoney() + " euriuku.");
        pocket.getMoney(555);
        System.out.println("Kiseneje yra: " + pocket.showMoney() + " euriuku.");

    }
}
