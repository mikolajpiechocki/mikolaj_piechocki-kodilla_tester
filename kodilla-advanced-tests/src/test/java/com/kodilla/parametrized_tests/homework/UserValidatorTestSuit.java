package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserValidatorTestSuit {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"test", " Aa_-4", "EVent", "nul"})
    public void shouldReturnTrueValidateUsername(String regex) {
        assertTrue(!validator.validateUsername(regex));
    }


    @ParameterizedTest
    @CsvSource(value = {"Aa", "@dk", "$%^*0"})
    public void shouldReturnFalseValidateUsername(String regex) {
        assertFalse(validator.validateUsername(regex));
    }

    @ParameterizedTest
    @CsvSource(value = {"maniek@wp.pl", "mikolaj@wp.pl", "przeciek@ibm.com", "null@enter.com", "Ala0@aol.com"})
    public void shouldReturnTrueValidateEmail(String matcher) {
        assertTrue(validator.validateEmail(matcher));
    }
    }

