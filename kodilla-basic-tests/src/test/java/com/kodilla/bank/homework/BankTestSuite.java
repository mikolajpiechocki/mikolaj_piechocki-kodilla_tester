package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;

import com.kodilla.bank.homework.CashMachine;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
   /*     @Test
        public void shouldCalculateCorrectAveragesIfValuesAreInRange() {
            Bank bank = new Bank("ATP00192");
            bank.addWithdrawalCashMachine(-300);
            bank.addWithdrawalCashMachine(-500);
            bank.addWithdrawalCashMachine(-100);
            bank.addDepositCashMachine(100);
            bank.addDepositCashMachine(200);
            double withdrawalCashMachine = bank.getWithdrawalCashMachine();
            double depositCashMachine = bank.getDepositCashMachine();
            assertEquals( -300, withdrawalCashMachine, 0.01);
            assertEquals(150, depositCashMachine, 0.01);
        }
        @Test
        public void shouldCalculateAveragesIfValuesAreOutsideRange() {
            Bank bank = new Bank("ATP00192");
            bank.addWithdrawalCashMachine(-3000);
            bank.addWithdrawalCashMachine(-500);
            bank.addWithdrawalCashMachine(-100);
            bank.addWithdrawalCashMachine(0);
            bank.addWithdrawalCashMachine(200);
            bank.addDepositCashMachine(-100);
            bank.addDepositCashMachine(200);
            bank.addDepositCashMachine(0);
            bank.addDepositCashMachine(5001);
            bank.addDepositCashMachine(2000);
            double withdrawalCashMachine = bank.getWithdrawalCashMachine();
            double depositCashMachine = bank.getDepositCashMachine();
            assertEquals( -600, withdrawalCashMachine, 0.01);
            assertEquals(2200, depositCashMachine, 0.01);
        }*/

@Test
public void countBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(10);
        cashMachine.add(20);
        cashMachine.add(50);

        assertEquals(80, cashMachine.getBalance());
        }

@Test
public void countWithdraw() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-25);
        cashMachine.add(-25);
        cashMachine.add(-25);
        System.out.println("Withdraw " + cashMachine.getWithdraw());


        assertEquals(75, cashMachine.getWithdraw());
        }

@Test
public void countOfWithdraws() {
        CashMachine cashMachine = new CashMachine ();
        cashMachine.add(-100);
        cashMachine.add(-200);
        cashMachine.add(-100);

        assertEquals(3, cashMachine.getCountOfWithdraws());
        }

@Test
public void countPayments() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(0);
        cashMachine.add(10);
        cashMachine.add(10);

        assertEquals(20, cashMachine.getPayment());
        }

@Test
public void countOfPayments() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(60);
        cashMachine.add(70);

        assertEquals(3, cashMachine.getCountOfPayments());
        }
}
