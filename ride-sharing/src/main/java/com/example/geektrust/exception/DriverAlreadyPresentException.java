package com.example.geektrust.exception;

import lombok.Data;

@Data
public class DriverAlreadyPresentException extends Exception {
    private String message;
    public DriverAlreadyPresentException(String message) {
        this.message = message;
    }
}
