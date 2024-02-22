package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult, 0.01);
    }
    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int substractResult = calculator.substract(a, b);
        assertEquals(-3, substractResult, 0.01);
    }

    @Test
    public void testPowerNumberWithPlus(){
        Calculator calculator = new Calculator();
        int a = 5;
        double powerResult = calculator.power(a);
        assertEquals(25, powerResult, 0.01);
    }
    @Test
    public void testPowerNumberZero(){
        Calculator calculator = new Calculator();
        int a = 0;
        double powerResult = calculator.power(a);
        assertEquals(0, powerResult, 0.01);
    }
    @Test
    public void testPowerNumberWithMinus(){
        Calculator calculator = new Calculator();
        int a = - 5;
        double powerResult = calculator.power(a);
        assertEquals(25, powerResult, 0.01);
    }
}
