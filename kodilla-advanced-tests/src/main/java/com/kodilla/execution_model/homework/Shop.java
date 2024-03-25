package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public List<Order> getOrdersByDate(LocalDate startDate, LocalDate endDate){
        return orders.stream()
                .filter(order -> order.getDate().compareTo(startDate) >= 0)
                .filter(order -> order.getDate().compareTo(endDate) <=0)
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByValue(double minValue, double maxValue){
        return orders.stream()
                .filter(order -> order.getValue() >= minValue)
                .filter(order -> order.getValue() <= maxValue)
                .collect(Collectors.toList());
    }

    public int getOrdersNumber(){
        return orders.size();
    }

    public double getSumValueFromAllOrders(){
        return orders.stream()
                .mapToDouble(order -> order.getValue())
                .sum();
    }

}
