package com.kodilla.abstracts.homework;

public class Kolo extends Shape{

   private double r;

   public Kolo (double r){
       this.r = r;
   }
    @Override
    public double area() {
       return Math.PI * r * r;
    }

    @Override
    public double obwod() {
        return 2 * Math.PI * r;
    }
}
