package com.kodilla.bank.homework;

import com.kodilla.basic_assertion.Calculator;
import org.w3c.dom.ls.LSOutput;

/*public class CashMachine {  //pierwsze podejście
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
    }*/
    // Nie wiem jak dalej to zsumować ( trochę się pogubiłem z całością) stan bankomatu
public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }
    public void add(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }
    public int getBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int balance = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            balance += this.transactions[i];
        }
        return balance;
    }
    public int getWithdraw() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int withdraw = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                withdraw -= this.transactions[i];
                System.out.println("Wartosc po odejmowaniu " + withdraw);
            }
        }
        return withdraw;
    }
    public int getCountOfWithdraws() {
        int count = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                count++;
            }
        }
        return count;
    }
    public int getPayment() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int payment = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                payment += this.transactions[i];
            }
        }
        return payment;
    }
    public int getCountOfPayments() {
        int count = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                count++;
            }
        }
        return count;
    }
}

