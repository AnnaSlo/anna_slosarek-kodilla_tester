package com.kodilla.abstracts.homework;

public class Kwadrat extends Shape{

    private double a;

    public Kwadrat (double a){
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double obwod() {
        return 4 * a;
    }
}
