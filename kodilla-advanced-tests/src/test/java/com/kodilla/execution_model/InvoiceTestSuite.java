package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item tea = new Item("Tea", 2.50);
    Item cookie = new Item ("Cookie", 5.0);
    Item chocolate = new Item("Chocolate", 3.50);

    @Test
    public void shouldAddItemToInvoice() {
        //when
        int numberOfItems = invoice.getSize();

        //then
        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem(){
        //when
        Item result = invoice.getItem(2);

        //then
        assertEquals("Chocolate", result.getName());
        assertEquals(3.50, result.getPrice());
    }

    @Test
    public void shouldReturnNullForNegativeIndex() {
        //when
        Item result = invoice.getItem(-2);

        //then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullForOutOfRangeIndex() {
        //when
        Item result = invoice.getItem(7);

        //then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice(){
       //when
        invoice.clear();

        //then
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(tea);
        invoice.addItem(cookie);
        invoice.addItem(chocolate);
    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}