package com.demo.collections02;

import java.util.ArrayList;
import java.util.List;

public class ProgramToInterfaceDog {

    public static void main(String[] args) {
        List<Dog> poms = new ArrayList<>();
        //good - programming to interface, loose coupling
        Dog pomeranian = new Pomeranian();
        pomeranian.bark(); //available
        poms.add(pomeranian);
        // pomeranian.doPeePeeALot(); not available
        // pomeranian

        //you have to try to avoid using concrete classes like
        //public ArrayList doSomething(HashMap map)
        //you are tied to two concrete implementations here.
        //if this changes, you have to change the calling code

        //but if you would have declared it like that
        //public List doSomething(Map map);
        //no matter what list you return it will not be errorness

        //bad - programming to a concrete class
        Pomeranian anotherPomeranian = new Pomeranian();
        anotherPomeranian.bark(); //available
        anotherPomeranian.doPeePeeALot(); //available
        anotherPomeranian.doPeePeeALot();
        anotherPomeranian.doPeePeeALot();
        anotherPomeranian.doPeePeeALot();
        anotherPomeranian.doPeePeeALot();
        anotherPomeranian.doPeePeeALot();
        anotherPomeranian.doPeePeeALot();

        poms.add(anotherPomeranian);


    }
}
