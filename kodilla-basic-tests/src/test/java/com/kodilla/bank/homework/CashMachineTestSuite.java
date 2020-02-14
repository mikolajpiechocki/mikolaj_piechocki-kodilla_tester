package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import com.kodilla.bank.homework.CashMachine;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*public class CashMachineTestSuite {   //pierwsze podejście
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transaction = cashMachine.getValues();
        assertEquals(0, transaction.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(4);
        cashMachine.addTransaction(2);

        int[] transaction = cashMachine.getValues();
        assertEquals(2, transaction.length);
        assertEquals(4, transaction[0]);
        assertEquals(2, transaction[1]);
    }
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
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