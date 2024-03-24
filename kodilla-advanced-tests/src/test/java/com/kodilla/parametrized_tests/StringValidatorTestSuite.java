package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();
    @ParameterizedTest
    @ValueSource(strings = {"Test"})
    public void shouldReturnTrueIfStringHasOnlySpaces(String text){
        assertFalse(validator.iSBlank(text));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsNullAndEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.iSBlank(text));
    }

//    @ParameterizedTest
//    @ValueSource(strings = {"","   "})
//    public void shouldReturnTrueIfStringIsEmpty(String text){
//        assertTrue(validator.iSBlank(text));
//    }
//
//    @ParameterizedTest
//    @EmptySource
//    public void shouldReturnTrueIfStringIsNull(String text) {
//        assertTrue(validator.iSBlank(text));
//    }

//    @ParameterizedTest
//    @NullSource
//    public void shouldReturnTrueIfStringIsNull(String text) {
//        assertTrue(validator.iSBlank(text));
//    }

//    @Test
//    public void shouldReturnFalseIfStringIsNotEmpty(){
//        assertFalse(validator.iSBlank("Test"));
//    }
//
//    @Test
//    public void shouldReturnTrueIfStringIsEmpty(){
//        assertTrue(validator.iSBlank(""));
//    }
//
//    @Test
//    public void shouldReturnTrueIfStringHasOnlySpaces(){
//        assertTrue(validator.iSBlank("    "));
//    }
//
//    @Test
//    public void shouldReturnTrueIfStringIsNull() {
//        assertTrue(validator.iSBlank(null));
//    }

}