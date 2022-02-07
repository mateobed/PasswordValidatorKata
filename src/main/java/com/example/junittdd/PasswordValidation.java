package com.example.junittdd;

public class PasswordValidation {

    public static final int MIN_PASSWORD_LENGTH = 6;
    public static final int MAX_PASSWORD_LENGTH = 20;

    public boolean validate(String password) {
        return password.length() <= MAX_PASSWORD_LENGTH
                && password.length() >= MIN_PASSWORD_LENGTH;
    }
}
