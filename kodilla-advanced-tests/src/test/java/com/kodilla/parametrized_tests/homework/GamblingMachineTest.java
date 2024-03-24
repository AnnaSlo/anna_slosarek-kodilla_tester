package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GamblingMachineTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbers.csv", numLinesToSkip = 0)
    public void shouldCountHowManyWinsForValidNumbers(String numbers){
        Set<Integer> userNumbers = convertStringToSet(numbers);
        GamblingMachine gamblingMachine = new GamblingMachine();
        assertDoesNotThrow(()->gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionForInvalidNumbers(String numbers){
        Set<Integer> userNumbers = convertStringToSet(numbers);
        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class, ()->gamblingMachine.howManyWins(userNumbers));
    }


    private Set<Integer> convertStringToSet(String numbers) {
        Set<Integer> result = new HashSet<>();
        for (String numberStr : numbers.split(";")) {
            result.add(Integer.parseInt(numberStr.trim()));
        }
        return result;
    }
}