package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DoubleSources#provideDoubleForTestingBMI")
    public void testBMI(double heightInMeters, double weightInKilograms, String expectedBMI){
        Person person = new Person(heightInMeters,weightInKilograms);
        assertEquals(expectedBMI,person.getBMI());

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println(bmi);
    }

}