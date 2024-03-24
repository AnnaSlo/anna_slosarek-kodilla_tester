package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoubleSources {
    static Stream<Arguments> provideDoubleForTestingBMI(){
        return Stream.of(
                Arguments.of(1.62, 93, "Obese Class II (Severely obese)"),
                Arguments.of(1.83, 88, "Overweight"),
                Arguments.of(1.70, 65, "Normal (healthy weight)"),
                Arguments.of(1.65, 45, "Underweight"),
                Arguments.of(1.90, 70, "Normal (healthy weight)")
        );
    }
}
