package com.demo.collections01;

public class FlyingBug implements Insect, Annoying {

    @Override
    public void flyAroundYourHead() {
        System.out.println("flying bzzz bzzz annoying");
    }

    @Override
    public void landOnThings() {
        System.out.println("i landed on kaka now on your food bzzz");
    }

    @Override
    public void justBeAnnoying() {
        flyAroundYourHead();
        landOnThings();
    }
}
