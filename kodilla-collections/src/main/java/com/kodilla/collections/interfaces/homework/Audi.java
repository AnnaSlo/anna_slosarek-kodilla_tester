package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private int speed;

    public Audi(){
        this.speed = 0;
    }
;    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
    this.speed = this.speed + 7;
    }

    @Override
    public void decreaseSpeed() {
    this.speed = this.speed - 3;

    }
}
