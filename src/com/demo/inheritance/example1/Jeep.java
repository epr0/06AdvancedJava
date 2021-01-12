package com.demo.inheritance.example1;
//paveldi vehicle savybes
public class Jeep extends Vehicle {

    private Trailer trailer;

    public Jeep(int maxSpeed) {
        super(maxSpeed);
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    class Trailer {

        private String color;

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

    }
}
