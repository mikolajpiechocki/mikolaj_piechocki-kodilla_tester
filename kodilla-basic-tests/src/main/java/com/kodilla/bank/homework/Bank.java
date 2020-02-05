package com.kodilla.bank.homework;

public class Bank {
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
    }
}
