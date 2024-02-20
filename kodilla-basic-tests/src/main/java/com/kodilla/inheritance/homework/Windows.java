package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows () {
        super (1990);

    }
    @Override
    public void turnOn() {
        System.out.println("Włącz Windows");
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłącz Windows");
    }
}
