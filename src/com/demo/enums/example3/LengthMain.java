package com.demo.enums.example3;

public class LengthMain {
    public static void main(String[] args) {
        System.out.println(LengthUnit.INCH.convertToMeters());
        System.out.println(LengthUnit.FOOT.convertToMeters());
        System.out.println(LengthUnit.CENTIMETER.convertToMeters());

        for (LengthUnit lengthUnit : LengthUnit.values()) {
            System.out.println(lengthUnit);
        }
        System.out.println();
        System.out.println(LengthUnit.CENTIMETER.toString());
    }
}
