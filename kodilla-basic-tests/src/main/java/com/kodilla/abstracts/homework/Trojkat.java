package com.kodilla.abstracts.homework;

public class Trojkat extends Shape {
    double a;
    double b;
    double c;
    double h;

    public Trojkat (double a, double b, double c, double h){
        this.a =a ;
        this.b = b;
        this.c =c;
        this.h = h;
    }

    @Override
    public double area() {
        return a * h * 0.5;
    }

    @Override
    public double obwod() {
        return a + b + c;
    }
}
