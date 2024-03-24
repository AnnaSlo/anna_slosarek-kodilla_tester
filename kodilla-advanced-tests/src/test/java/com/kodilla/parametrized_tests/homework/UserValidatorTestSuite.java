package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();
    @ParameterizedTest
    @ValueSource(strings = {"u11","user1", "user_user", "123user", "-user", "_user", "user123-user","user.user.user"})
    public void shouldValidateUsername_withValidCases(String input){
        boolean result = userValidator.validateUsername(input);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"us", "   ", "12", "!!!", "@invalid", "user/user"})
    public void shouldNotValidateUsername_withInvalidCases(String input){
        boolean result = userValidator.validateUsername(input);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"x@example.com","simple@example.com", "firstname.lastname@example.com", "email@subdomain.example.com", "1234567890@example.com", "email@example-one.com", "_______@example.com", "email@example.name", "email@example.museum", "email@example.co.jp", "firstname-lastname@example.com", "other.email-with-dash@example-one.com" })
    public void shouldValidateEmail_withValidCases (String input){
        boolean result = userValidator.validateEmail(input);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings ={"@example.com","user@.com","user.name@example",".user@example.com","user@example..com","user@example_com","user name@example.com","user/name@example.com","user@exa_mple.com","user+name@example.com"})
    public void shouldNotValidateEmail__withInvalidCases (String input){
        boolean result = userValidator.validateEmail(input);
        assertFalse(result);
    }


}