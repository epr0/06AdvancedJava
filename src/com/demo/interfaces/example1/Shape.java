package com.demo.interfaces.example1;

public interface Shape {
    //variables in the interface are public static by default;
    String color = "Red";
    ShapeFormat format = ShapeFormat.TWO_DIMENTIONAL;

    double getArea();
    double getPerimeter();
    String getFormat();

    default void print(){
        System.out.println("Shape: " + this);
    }



}
