package com.kodilla.bank.homework;

public class CashMaschine {

    private int[] transactions;
    private int size;
    int balance;

    public CashMaschine(){
        this.size = 0;
        this.transactions = new int[0];
        this.balance = 0;
    }

    public void addTransaction (int value){
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions,0,newTab,0,transactions.length);
        newTab[this.size-1] = value;
        this.transactions = newTab;

        this.updateBalance(value);
    }

    public void updateBalance(int value){
        balance = balance + value;
    }
    public int getBalance(){
        return this.balance;
    }

    public int[] getTransactions(){
        return this.transactions;
    }
    public int getNumberOfTransactions(){
        return this.size;
    }
}
