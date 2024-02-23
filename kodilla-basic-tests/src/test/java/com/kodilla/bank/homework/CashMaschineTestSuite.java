package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMaschineTestSuite {
    private CashMaschine cashMaschine = new CashMaschine();

    @Test
    public void shouldHaveZeroLength(){
        int[] transactions = cashMaschine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray(){
        cashMaschine.addTransaction(100);
        cashMaschine.addTransaction(-200);
        int[] transactions = cashMaschine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(100, transactions[0]);
        assertEquals(-200,transactions[1]);
    }

    @Test
    public void shouldUpdateBalance(){
        cashMaschine.addTransaction(100);
        cashMaschine.addTransaction(-200);
        assertEquals(-100,cashMaschine.getBalance(),0.01);
    }

    @Test
    public void shouldCalculateNumberOfTransactions(){
        cashMaschine.addTransaction(100);
        cashMaschine.addTransaction(-200);
        assertEquals(2,cashMaschine.getNumberOfTransactions(),0.01);
    }
}
