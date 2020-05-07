package com.demo.collections01;

import java.util.ArrayList;
import java.util.List;

public class DiningRoom {

    public static void main(String[] args) {
        List<Annoying> annoyingCreatures = new ArrayList<>();
        annoyingCreatures.add(new FlyingBug());
        annoyingCreatures.add(new Telemarketer());

        for(Annoying annoyingThing : annoyingCreatures) {
            annoyingThing.justBeAnnoying();
        }
    }
}
