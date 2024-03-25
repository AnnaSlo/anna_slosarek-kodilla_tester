package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTest {

    private Shop shop = new Shop();

    @BeforeEach
    public void setupShop(){
        shop.addOrder(new Order(100.0, LocalDate.of(2024,02,13),"annas"));
        shop.addOrder(new Order(150.0, LocalDate.of(2023,12,01),"bart123"));
        shop.addOrder(new Order(50.0, LocalDate.of(2024,03,25), "luki15"));
        shop.addOrder(new Order(15.0, LocalDate.of(2022,9,25),"dawidsl"));
    }

    @Test
    public void shouldAddOrder() {
        //given
        int expectedSizeBefore = shop.getOrdersNumber();
        Order newOrder = new Order(75.0, LocalDate.now(),"annaslo");

        //when
        shop.addOrder(newOrder);
        int sizeAfterAdd = shop.getOrdersNumber();

        //then
        assertEquals(expectedSizeBefore + 1, sizeAfterAdd);
    }

    @Test
    public void shouldGetOrdersByDateRange(){
        //given
        LocalDate startDate = LocalDate.of(2022,1,1);
        LocalDate endDate = LocalDate.of(2024, 1,1);

        //when
        List<Order> orders = shop.getOrdersByDate(startDate,endDate);

        //then
        assertEquals(2,orders.size());
    }

    @Test
    public void shouldGetOrdersByValueRange(){
        //given
        double minValue = 100.0;
        double maxValue = 500.0;

        //when
        List<Order> orders = shop.getOrdersByValue(minValue,maxValue);

        //then
        assertEquals(2, orders.size());
    }

    @Test
    public void shouldGetCorrectOrdersNumber(){
        int numbersOfOrders = shop.getOrdersNumber();
        assertEquals(4,numbersOfOrders);
    }

    @Test
    public void shouldGetCorrectSumValueFromAllOrders(){
        double sumValue = shop.getSumValueFromAllOrders();
        assertEquals(315.0,sumValue, 0.01);
    }
}