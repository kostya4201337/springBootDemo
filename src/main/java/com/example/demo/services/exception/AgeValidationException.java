package com.example.demo.services.exception;

public class AgeValidationException extends RuntimeException {
    public AgeValidationException(final String message) {
        super(message);
    }
}
