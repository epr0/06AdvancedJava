package com.demo.encapsulation.example3;

public class Pocket {
    private double money;

    public Pocket(double money) {
        this.money = money;
    }

    public double getMoney(double money) {
        if(this.money > money){
            this.money = this.money - money;
        }
        return this.money <= 10 ? 0 : this.money;
    }

    public double showMoney(){
        return money;
    }

    public void setMoney(double money) {
        if(money < 0) {
            System.out.println("Negali idet neigiamos sumos i kisene");
        } else if(money > 3000) {
            System.out.println("Tavo kiseneje nera tiek vietos");
        } else {
            this.money = this.money + money;
        }
    }
}
