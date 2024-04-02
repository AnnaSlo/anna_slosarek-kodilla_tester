package com.kodilla.mockito.homework;

import java.util.Objects;

public class Location {

    private String name;

    public String getName() {
        return name;
    }

    public Location(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location location)) return false;
        return Objects.equals(getName(), location.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
