package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double value;
    private LocalDate date;
    private String login;

    public Order(double value, LocalDate date, String login) {
        this.value = value;
        this.date = date;
        this.login = login;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Double.compare(getValue(), order.getValue()) == 0 && Objects.equals(getDate(), order.getDate()) && Objects.equals(getLogin(), order.getLogin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue(), getDate(), getLogin());
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }
}
