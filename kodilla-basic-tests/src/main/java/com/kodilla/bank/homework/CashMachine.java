package com.kodilla.bank.homework;

import com.kodilla.basic_assertion.Calculator;
import org.w3c.dom.ls.LSOutput;

public class CashMachine {
    private int[] transaction;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transaction = new int[0];
    }

    public void addTransaction(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transaction, 0, newTab, 0, transaction.length);
        newTab[this.size - 1] = value;
        this.transaction = newTab;
    }

    public int[] getValues() {
        return transaction;
    }
    public double getAverage1() {
        if (this.transaction.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.transaction.length; i++) {
            sum += this.transaction[i];
        }
            return sum/this.transaction.length;
    }
    // Nie wiem jak dalej to zsumować ( trochę się pogubiłem z calłością) stan bankomatu
}
