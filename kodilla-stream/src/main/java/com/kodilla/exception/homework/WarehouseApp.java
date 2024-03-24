package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("456"));
        warehouse.addOrder(new Order("789"));

        String orderNumber = "10112";
        try {
            Order foundOrder = warehouse.getOrder(orderNumber);
            System.out.println("Order found: " + foundOrder.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Order: " + orderNumber + " doesn't exist.");
        }
    }

}
