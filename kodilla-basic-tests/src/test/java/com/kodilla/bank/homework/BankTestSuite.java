package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    Bank bank = new Bank();

    @Test
    public void shouldHaveZeroLength(){
        CashMaschine[] cashMaschines = bank.getCashMaschines();
        assertEquals(0, cashMaschines.length);
    }

    @Test
    public void shouldAddThreeElementsToArray(){
        CashMaschine cashMaschine1 = new CashMaschine();
        CashMaschine cashMaschine2 = new CashMaschine();
        CashMaschine cashMaschine3 = new CashMaschine();
        bank.addNewCashMaschine(cashMaschine1);
        bank.addNewCashMaschine(cashMaschine2);
        bank.addNewCashMaschine(cashMaschine3);

        CashMaschine[] cashMaschines = bank.getCashMaschines();
        assertEquals(3, cashMaschines.length);
        assertEquals(cashMaschine1,cashMaschines[0]);
        assertEquals(cashMaschine2,cashMaschines[1]);
        assertEquals(cashMaschine3,cashMaschines[2]);
    }
    @Test
    public void shouldReturnZeroBalanceForNewCashMaschines(){
        CashMaschine cashMaschine1 = new CashMaschine();
        CashMaschine cashMaschine2 = new CashMaschine();
        CashMaschine cashMaschine3 = new CashMaschine();
        bank.addNewCashMaschine(cashMaschine1);
        bank.addNewCashMaschine(cashMaschine2);
        bank.addNewCashMaschine(cashMaschine3);

        int totalBalance = bank.getBalanceFromAllCashMaschines();
        assertEquals(0, totalBalance);
    }

    @Test
    public void shouldReturnTotalBalanceForAllCashMaschines(){
        CashMaschine cashMaschine1 = new CashMaschine();
        CashMaschine cashMaschine2 = new CashMaschine();
        CashMaschine cashMaschine3 = new CashMaschine();
        bank.addNewCashMaschine(cashMaschine1);
        bank.addNewCashMaschine(cashMaschine2);
        bank.addNewCashMaschine(cashMaschine3);
        cashMaschine1.addTransaction(100);
        cashMaschine1.addTransaction(-300);
        cashMaschine2.addTransaction(150);
        cashMaschine2.addTransaction(250);
        cashMaschine3.addTransaction(-100);
        cashMaschine3.addTransaction(-200);

        int totalBalance = bank.getBalanceFromAllCashMaschines();
        assertEquals(-100, totalBalance);
    }
    @Test
    public void shouldReturnTotalWithdrawalsSum(){
        CashMaschine cashMaschine1 = new CashMaschine();
        CashMaschine cashMaschine2 = new CashMaschine();
        CashMaschine cashMaschine3 = new CashMaschine();
        bank.addNewCashMaschine(cashMaschine1);
        bank.addNewCashMaschine(cashMaschine2);
        bank.addNewCashMaschine(cashMaschine3);
        cashMaschine1.addTransaction(100);
        cashMaschine1.addTransaction(-300);
        cashMaschine2.addTransaction(150);
        cashMaschine2.addTransaction(250);
        cashMaschine3.addTransaction(-100);
        cashMaschine3.addTransaction(-200);

        int totalWithdrawalsSum = bank.getTotalWithdrawalsSum();
        assertEquals(-600, totalWithdrawalsSum);
    }
    @Test
    public void shouldReturnTotalWithdrawalsCount(){
        CashMaschine cashMaschine1 = new CashMaschine();
        CashMaschine cashMaschine2 = new CashMaschine();
        CashMaschine cashMaschine3 = new CashMaschine();
        bank.addNewCashMaschine(cashMaschine1);
        bank.addNewCashMaschine(cashMaschine2);
        bank.addNewCashMaschine(cashMaschine3);
        cashMaschine1.addTransaction(100);
        cashMaschine1.addTransaction(-300);
        cashMaschine2.addTransaction(150);
        cashMaschine2.addTransaction(250);
        cashMaschine3.addTransaction(-100);
        cashMaschine3.addTransaction(-200);

        int totalWithdrawalsCount = bank.getTotalWithdrawalsCount();
        assertEquals(3, totalWithdrawalsCount);
    }

    @Test
    public void shouldReturnTotalAverageOfWithdrawals(){
        CashMaschine cashMaschine1 = new CashMaschine();
        CashMaschine cashMaschine2 = new CashMaschine();
        CashMaschine cashMaschine3 = new CashMaschine();
        bank.addNewCashMaschine(cashMaschine1);
        bank.addNewCashMaschine(cashMaschine2);
        bank.addNewCashMaschine(cashMaschine3);
        cashMaschine1.addTransaction(100);
        cashMaschine1.addTransaction(-300);
        cashMaschine2.addTransaction(150);
        cashMaschine2.addTransaction(250);
        cashMaschine3.addTransaction(-100);
        cashMaschine3.addTransaction(-200);

        double totalAverageWithdrawals = bank.getTotalAverageOfWithdrawals();
        assertEquals(-200, totalAverageWithdrawals,0.1);
    }
    @Test
    public void shouldReturnTotalDepositsSum(){
        CashMaschine cashMaschine1 = new CashMaschine();
        CashMaschine cashMaschine2 = new CashMaschine();
        CashMaschine cashMaschine3 = new CashMaschine();
        bank.addNewCashMaschine(cashMaschine1);
        bank.addNewCashMaschine(cashMaschine2);
        bank.addNewCashMaschine(cashMaschine3);
        cashMaschine1.addTransaction(100);
        cashMaschine1.addTransaction(-300);
        cashMaschine2.addTransaction(150);
        cashMaschine2.addTransaction(250);
        cashMaschine3.addTransaction(-100);
        cashMaschine3.addTransaction(-200);

        int totalDepositsSum = bank.getTotalDepositsSum();
        assertEquals(500, totalDepositsSum);
    }
    @Test
    public void shouldReturnTotalDepositsCount(){
        CashMaschine cashMaschine1 = new CashMaschine();
        CashMaschine cashMaschine2 = new CashMaschine();
        CashMaschine cashMaschine3 = new CashMaschine();
        bank.addNewCashMaschine(cashMaschine1);
        bank.addNewCashMaschine(cashMaschine2);
        bank.addNewCashMaschine(cashMaschine3);
        cashMaschine1.addTransaction(100);
        cashMaschine1.addTransaction(-300);
        cashMaschine2.addTransaction(150);
        cashMaschine2.addTransaction(250);
        cashMaschine3.addTransaction(-100);
        cashMaschine3.addTransaction(-200);

        int totalDepositsCount = bank.getTotalDepositsCount();
        assertEquals(3, totalDepositsCount);
    }

    @Test
    public void shouldReturnTotalAverageOfDeposits(){
        CashMaschine cashMaschine1 = new CashMaschine();
        CashMaschine cashMaschine2 = new CashMaschine();
        CashMaschine cashMaschine3 = new CashMaschine();
        bank.addNewCashMaschine(cashMaschine1);
        bank.addNewCashMaschine(cashMaschine2);
        bank.addNewCashMaschine(cashMaschine3);
        cashMaschine1.addTransaction(100);
        cashMaschine1.addTransaction(-300);
        cashMaschine2.addTransaction(150);
        cashMaschine2.addTransaction(250);
        cashMaschine3.addTransaction(-100);
        cashMaschine3.addTransaction(-200);

        double totalAverageDeposits = bank.getTotalAverageOfDeposits();
        assertEquals(166.7, totalAverageDeposits,0.1);
    }
}
