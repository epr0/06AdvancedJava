package com.demo.composition.example2;

public class ComputerMain {
    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        monitor.setDisplaySize(17);

        Mouse mouse = new Mouse();
        mouse.setButtonCount(3);
        mouse.setOptical(true);

        ComputerSet computerSet = new ComputerSet();
        computerSet.setMonitor(monitor);
        computerSet.setMouse(mouse);

        Paper paper = new Paper();
        paper.setFormat("A4");
        Printer printer = new Printer();
        printer.setBrand("HP");
        printer.setWeight(20);
        printer.setPaper(paper);

        System.out.println("Computer parameters:");
        System.out.println("Monitor display size: " + computerSet.getMonitor().getDisplaySize());
        System.out.println("Mouse button count: " + computerSet.getMouse().getButtonCount());
        String suffix = computerSet.getMouse().isOptical() ? "" : "NOT ";
        System.out.println("Mouse is " + suffix + "optical");
        System.out.println("Printer brand is " + printer.getBrand());
        System.out.println("Printer weight is " + printer.getWeight());
        System.out.println("Default paper format for the printer is " + printer.getPaper().getFormat());
    }
}
