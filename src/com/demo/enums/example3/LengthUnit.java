package com.demo.enums.example3;

public enum LengthUnit {
    METER(1, "Meter unit"),
    CENTIMETER(0.01, "Centimeter unit"),
    FOOT(0.3, "Foot unit"),
    INCH(0.025, "Inch unit");

    double value;
    String description;

    LengthUnit(double value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    double convertToMeters() {
        return value;
    }
}
