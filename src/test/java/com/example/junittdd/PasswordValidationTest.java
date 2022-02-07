package com.example.junittdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {
    PasswordValidation passwordValidation = new PasswordValidation();

    @Test
    void shouldAcceptPasswordLongerThanSixCharacters() {
        String passwordToCheck = "1234567";
        boolean result = passwordValidation.validate(passwordToCheck);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void shouldAcceptPasswordWithSixCharacters() {
        String passwordToCheck = "123456";
        boolean result = passwordValidation.validate(passwordToCheck);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void shouldNotAcceptPasswordShorterThanSixCharacters(){
        String passwordToTest = "1234";

        boolean result = passwordValidation.validate(passwordToTest);
        Assertions.assertThat(result).isFalse();
    }
}