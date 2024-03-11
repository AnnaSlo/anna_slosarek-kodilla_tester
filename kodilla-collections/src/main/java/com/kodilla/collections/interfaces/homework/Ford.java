package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car {

    private int speed;

    public Ford() {
        this.speed = 0;
    }

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 10;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed - 5;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ford ford)) return false;
        return getSpeed() == ford.getSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpeed());
    }
}
