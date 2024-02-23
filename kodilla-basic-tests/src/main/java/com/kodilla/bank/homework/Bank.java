package com.kodilla.bank.homework;

public class Bank {
    private CashMaschine[] cashMaschines;
    private int numberOfCashMaschines;

    public Bank(){
        this.numberOfCashMaschines = 0;
        this.cashMaschines = new CashMaschine[0];
    }

    public void addNewCashMaschine(CashMaschine cashMaschine){
        this.numberOfCashMaschines++;
        CashMaschine[] newTab = new CashMaschine[this.numberOfCashMaschines];
        System.arraycopy(cashMaschines, 0, newTab, 0, cashMaschines.length);
        newTab[this.numberOfCashMaschines -1] = cashMaschine;
        this.cashMaschines = newTab;
    }

    public CashMaschine[] getCashMaschines(){
        return cashMaschines;
    }

    public int getBalanceFromAllCashMaschines(){
        int totalBalanceSum = 0;
        for (int i = 0; i < this.cashMaschines.length; i++){
            totalBalanceSum = totalBalanceSum + this.cashMaschines[i].getBalance();
        }
        return totalBalanceSum;
    }

    // WITHDRAWALS

    public int getTotalWithdrawalsSum(){
        int totalWithdrawalsSum = 0;
        for (int i = 0; i < this.cashMaschines.length; i++){
            for (int x = 0; x < this.cashMaschines[i].getTransactions().length; x++) {

                if (this.cashMaschines[i].getTransactions()[x] < 0) {
                    totalWithdrawalsSum = totalWithdrawalsSum + this.cashMaschines[i].getTransactions()[x];
                }
            }
        }
        return totalWithdrawalsSum;
    }

    public int getTotalWithdrawalsCount(){
        int totalWithdrawalsCount = 0;
        for (int i = 0; i < this.cashMaschines.length; i++){
            for (int x = 0; x < this.cashMaschines[i].getTransactions().length; x++) {

                if (this.cashMaschines[i].getTransactions()[x] < 0) {
                    totalWithdrawalsCount = totalWithdrawalsCount + 1;
                }
            }
        }
        return totalWithdrawalsCount;
    }

    public double getTotalAverageOfWithdrawals(){
        return getTotalWithdrawalsSum() / (double) getTotalWithdrawalsCount();
    }


    // DEPOSITS
    public int getTotalDepositsSum() {
        int totalDepositsSum = 0;
        for (int i = 0; i < this.cashMaschines.length; i++) {
            for (int x = 0; x < this.cashMaschines[i].getTransactions().length; x++) {

                if (this.cashMaschines[i].getTransactions()[x] > 0) {
                    totalDepositsSum = totalDepositsSum + this.cashMaschines[i].getTransactions()[x];
                }
            }
        }
        return totalDepositsSum;
    }

    public int getTotalDepositsCount() {
        int totalDepositsCount = 0;
        for (int i = 0; i < this.cashMaschines.length; i++) {
            for (int x = 0; x < this.cashMaschines[i].getTransactions().length; x++) {

                if (this.cashMaschines[i].getTransactions()[x] > 0) {
                    totalDepositsCount = totalDepositsCount + 1;
                }
            }
        }
        return totalDepositsCount;
    }

    public double getTotalAverageOfDeposits(){
      return getTotalDepositsSum() / (double) getTotalDepositsCount();
    }
}
