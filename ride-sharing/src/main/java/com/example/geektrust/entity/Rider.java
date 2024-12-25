package com.example.geektrust.entity;

import lombok.Data;

import java.util.List;

@Data
public class Rider { // This class can be further extended to store ( contact info, rating )
    private String id;
    private double xCoordinate;
    private double yCoordinate;
    private List<String> matchedDrivers;
}
