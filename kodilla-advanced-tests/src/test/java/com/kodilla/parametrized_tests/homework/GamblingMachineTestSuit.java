package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class GamblingMachineTestSuit {

    private GamblingMachine userNumbers = new GamblingMachine();


    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv", numLinesToSkip = 1)
    public void shouldCheckHowManyWins(String input) throws com.kodilla.parametrized_tests.homework.InvalidNumbersException {
    String[] tableString = input.split(" ");
       // System.out.println(tableString);
        java.util.Set<Integer> setTable = new java.util.HashSet<>();
        for (String number: tableString){
            setTable.add(Integer.parseInt(number));
        }
        System.out.println(setTable.size());
        int howManyWins = userNumbers.howManyWins(setTable);
        System.out.println(howManyWins + " liczba wygranych");
    }

}