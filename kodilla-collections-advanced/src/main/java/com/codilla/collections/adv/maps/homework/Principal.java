package com.codilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstName;
    private String lastName;

    public Principal(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Principal principal)) return false;
        return Objects.equals(getFirstName(), principal.getFirstName()) && Objects.equals(getLastName(), principal.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
