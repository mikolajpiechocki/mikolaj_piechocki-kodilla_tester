package com.kodilla.parametrized_tests.homework;

public class DataForBMI {

    static java.util.stream.Stream<org.junit.jupiter.params.provider.Arguments> provideTestingBMI() {
        return java.util.stream.Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(40, 1.7, "Very severely underweight"),
                org.junit.jupiter.params.provider.Arguments.of(40, 1.6, "Severely underweight"),
                org.junit.jupiter.params.provider.Arguments.of(50, 1.7, "Underweight"),
                org.junit.jupiter.params.provider.Arguments.of(60, 1.7, "Normal (healthy weight)"),
                org.junit.jupiter.params.provider.Arguments.of(80, 1.75, "Overweight"),
                org.junit.jupiter.params.provider.Arguments.of(80, 1.6, "Obese Class I (Moderately obese)"),
                org.junit.jupiter.params.provider.Arguments.of(90, 1.6, "Obese Class II (Severely obese)"),
                org.junit.jupiter.params.provider.Arguments.of(100, 1.55, "Obese Class III (Very severely obese)"),
                org.junit.jupiter.params.provider.Arguments.of(110, 1.5, "Obese Class IV (Morbidly Obese)"),
                org.junit.jupiter.params.provider.Arguments.of(120, 1.5, "Obese Class V (Super Obese)"),
                org.junit.jupiter.params.provider.Arguments.of(160, 1.6, "Obese Class VI (Hyper Obese)")
                );
    }
}
