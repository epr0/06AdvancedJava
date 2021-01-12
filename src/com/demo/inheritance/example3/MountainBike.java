package com.demo.inheritance.example3;

import java.math.BigDecimal;
//MountainBike IS A Bicycle
public class MountainBike extends Bicycle {

    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear,int speed,
                        int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    //same method as in Bicycle

    public void commonBicycleBehavior() {
        //super.commonBicycleBehavior(); Parent behavior
        System.out.println("Turned into MountainBike behavior! (overriden)");
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override
    public String toString()
    {
        return (super.toString()+
                "\nseat height is "+seatHeight);
    }
}
