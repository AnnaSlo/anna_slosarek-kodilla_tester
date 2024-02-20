package com.kodilla.inheritance.homework;

public class Computer {
    public static void main (String [] args) {
        Linux linux = new Linux();
        linux.turnOn();
        linux.turnOff();

        Windows windows = new Windows();
        windows.turnOn();
        windows.turnOff();
    }
}
