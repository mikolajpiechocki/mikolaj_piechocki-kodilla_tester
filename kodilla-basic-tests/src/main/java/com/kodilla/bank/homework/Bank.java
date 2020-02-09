package com.kodilla.bank.homework;


/*public class Bank {          //wresja pierwotna
        private String name;
        private CashMachine withdrawal;
        private CashMachine deposit;


        public Bank(String name) {
            this.name = name;
            this.withdrawal = new CashMachine();
            this.deposit = new CashMachine();
        }

        public void addWithdrawalCashMachine (int transaction) {
            if (transaction < 0 && transaction > -2001) {
                this.withdrawal.addTransaction(transaction);
            }
        }
        public void addDepositCashMachine (int transaction) {
            if (transaction > 0 && transaction < 5001) {
                this.deposit.addTransaction(transaction);
            }
        }
        public double getWithdrawalCashMachine() {
            return this.withdrawal.getAverage1();
        }
        public double getDepositCashMachine() {
            return this.deposit.getAverage1();
        }
        public double getAverage1() {
            double sum = this.withdrawal.getAverage1() + this.deposit.getAverage1();
            return sum/2;
        }
        public double getSumTransaction() {
            double sum1 = this.withdrawal.addTransaction() + this.deposit.addTransaction();
            return sum1;
        }
    }*/

public class Bank {

    private String name;
    private CashMachine [] cashMachines;
    private int size;


    public Bank (String name) {
        this.name = name;

        this.cashMachines = new CashMachine[5];
    }

    public void add (CashMachine machine) {
        if (this.size < 4) {
            cashMachines[this.size] = machine;
            this.size++;
        }
    }

    public int getBalance() {
        int balance = 0;
        for (int i= 0; i <5; i++) {
            CashMachine temp = cashMachines[i];
            if (temp != null) {
                balance += temp.getBalance();
            }
        }
        return balance;
    }

    public int getCountOfWithdraws() {
        int count = 0;
        for (int i = 0; i <5; i++) {
            CashMachine temp = cashMachines[i];
            if (temp != null) {
                count += temp.getCountOfWithdraws();
            }
        }
        return count;
    }

    public int getSumOfWithdraws() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            CashMachine temp = cashMachines[i];
            if (temp != null) {
                sum += temp.getWithdraw();
            }
        }
        return sum;
    }

    public int getAverageOfWithdraws () {
        return getSumOfWithdraws()/getCountOfWithdraws();
    }

    public int getCountOfPayments() {
        int count = 0;
        for (int i = 0; i < 5; i++ ) {
            CashMachine temp = cashMachines[i];
            if (temp != null) {
                count += temp.getCountOfPayments();
            }
        }
        return count;
    }

    public int getSumOfPayments() {
        int sum = 0;
        for (int i =0; i <5;i++) {
            CashMachine temp = cashMachines[i];
            if (temp != null) {
                sum += temp.getPayment();
            }
        }
        return sum;
    }

    public int getAverageOfPayments() {
        return getSumOfPayments()/getCountOfPayments();
    }
}

