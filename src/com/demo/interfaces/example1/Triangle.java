package com.demo.interfaces.example1;

public class Triangle implements Shape {
    private double a;
    private double b;

    public Triangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b/2;
    }

    @Override
    public double getPerimeter() {
        return a+b+getIstrizaine();
    }

    @Override
    public String getFormat() {
        return Shape.format.toString();
    }

    public double getIstrizaine(){
        return Math.sqrt(a*a + b*b);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

}
