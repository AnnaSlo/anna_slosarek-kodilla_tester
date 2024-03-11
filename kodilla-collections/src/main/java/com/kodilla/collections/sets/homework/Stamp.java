package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double width;
    private double height;
    private boolean stamping;

    public Stamp(String name, double width, double height, boolean stamping) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.stamping = stamping;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", stamping=" + stamping +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp stamp)) return false;
        return Double.compare(width, stamp.width) == 0 && Double.compare(height, stamp.height) == 0 && stamping == stamp.stamping && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, stamping);
    }
}

