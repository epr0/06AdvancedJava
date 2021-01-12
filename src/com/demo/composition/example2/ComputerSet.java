package com.demo.composition.example2;

//Composition is achieved by using instance varables that refers to OTHER OBJECTS
//Benefit - if Monitor or mouse changes, Computer Set is not affected
//You can control Monitor and Mouse separately and hide the visibility of certain behavior
//And reuse only what you need
public class ComputerSet {
    private Monitor monitor;
    private Mouse mouse;

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
