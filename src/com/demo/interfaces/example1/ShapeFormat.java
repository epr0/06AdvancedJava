package com.demo.interfaces.example1;

public enum ShapeFormat {
    TWO_DIMENTIONAL("2D"), THREE_DIMENTIONAL("3D");

    String format;

    ShapeFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return format;
    }
}
