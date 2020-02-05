package com.kodilla.bank.homework;

import com.sun.security.ntlm.Client;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
        @Test
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
        }
}
