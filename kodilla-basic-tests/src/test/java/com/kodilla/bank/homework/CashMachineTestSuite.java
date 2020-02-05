package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
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
}
