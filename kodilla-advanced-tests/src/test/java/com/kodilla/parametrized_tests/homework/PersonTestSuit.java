package com.kodilla.parametrized_tests.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuit {



    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource(value = "com.kodilla.parametrized_tests.homework.DataForBMI#provideTestingBMI")
    public void shouldCalculateGetBMI(double weightInKilogram, double heightInMeters, String expected) {
        System.out.println(heightInMeters);
        System.out.println(weightInKilogram);
        System.out.println(expected);
        Person manipulator = new Person();
        System.out.println(manipulator.getBMI(heightInMeters,weightInKilogram));
        assertEquals(expected, manipulator.getBMI(heightInMeters,weightInKilogram));
    }
}