package com.demo.collections01;

public class Telemarketer implements AnnoyingPerson, Annoying {

    @Override
    public void callYouDuringLunch() {
        System.out.println("ring ring.. do you have a minute?");
    }

    @Override
    public void talkingFurtherWhenYouSayNo() {
        System.out.println("yes i understand but what if i told you..?");
    }

    @Override
    public void justBeAnnoying() {
        callYouDuringLunch();
        talkingFurtherWhenYouSayNo();
    }
}
