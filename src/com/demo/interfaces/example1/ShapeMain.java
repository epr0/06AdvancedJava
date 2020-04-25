package com.demo.interfaces.example1;

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("Staciakampio plotas: " + rectangle.getArea());
        System.out.println("Staciakampio perimetras: " + rectangle.getPerimeter());
        System.out.println("Staciakampio formatas: " + rectangle.getFormat());
        rectangle.print();
        System.out.println("===================================");
        Circle circle = new Circle(5);
        System.out.println("Apskritimo plotas: " + circle.getArea());
        System.out.println("Apskrtimo perimetras: " + circle.getPerimeter());
        System.out.println("Staciakampio formatas: " + circle.getFormat());
        circle.print();
        System.out.println("===================================");
        Triangle triangle = new Triangle(2,3);
        System.out.println("Trikampio plotas: " + triangle.getArea());
        System.out.println("Trikampio perimetras: " + triangle.getPerimeter());
        System.out.println("Trikampio formatas: " + triangle.getFormat());
        triangle.print();

        System.out.println("===================================");
        Shape rect = new Rectangle(1,2);
        System.out.println("Staciakampio plotas: " + rect.getArea());
        System.out.println("Staciakampio perimetras: " + rect.getPerimeter());
        System.out.println("Staciakampio formatas: " + rect.getFormat());
        rect.print();
    }
}
