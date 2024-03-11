package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car {

    private int speed;

    public Opel(){
        this.speed = 0;
    }

    public Opel(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
    this.speed = this.speed + 15;
    }

    @Override
    public void decreaseSpeed() {
    this.speed = this.speed - 10;
    }

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Opel opel)) return false;
        return getSpeed() == opel.getSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpeed());
    }

}
