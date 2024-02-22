package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a,b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int substractResult = calculator.subtract(a,b);
        boolean correctSubstract = ResultChecker.assertEquals(-3, substractResult);
        if (correctSubstract) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double powerResult = calculator.power(a);
        boolean correctPower = ResultChecker.assertEquals(25, powerResult);
        if (correctPower){
            System.out.println(" Metoda power działa poprawnie dla liczby " + a);
        } else {
            System.out.println(" Metoda power nie działa poprawnie dla liczby " + a);
        }

        }
    }
