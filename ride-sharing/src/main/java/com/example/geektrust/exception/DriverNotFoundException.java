package com.example.geektrust.exception;

import lombok.Data;

@Data
public class DriverNotFoundException extends Exception {
    private String message;
    public DriverNotFoundException(String message) {
        this.message = message;
    }
}
