package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testAddOrder(){
        //given
        Warehouse warehouse = new Warehouse();
        //when
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("999"));
        //then
        assertDoesNotThrow(() -> warehouse.getOrder("123"));
    }

    @Test
    public void testGetOrder_withExistingOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("999"));
        //when
        Order foundOrder = warehouse.getOrder("123");
        //then
        assertEquals("123",foundOrder.getNumber());
    }

    @Test
    public void testGetOrder_withNonExistingOrder(){
        //given
        Warehouse warehouse = new Warehouse();
        //when
        //then
        assertThrows(OrderDoesntExistException.class, ()->warehouse.getOrder("555"));
    }
}