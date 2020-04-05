package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTestSuite {

    private StringValidator validator = new StringValidator();

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    public void shouldReturnTrueIfStringIsEmpty1(String text) {
        assertTrue(validator.isBlank(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }
}
