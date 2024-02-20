package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {
    public Linux () {
        super (1995);
    }

    @Override
    public void turnOn() {
        System.out.println("Włącz Linux");
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłącz Linux");
    }
}
