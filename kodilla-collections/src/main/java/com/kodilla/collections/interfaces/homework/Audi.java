package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.Objects;

public class Audi implements Car {
    private int speed;

    public Audi() {
        this.speed = 0;
    }

    public Audi(int speed) {
        this.speed = speed;
    }



    @Override
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

    @Override
    public String toString() {
        return "Audi{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Audi audi)) return false;
        return getSpeed() == audi.getSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpeed());
    }


}
