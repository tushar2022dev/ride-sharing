package com.example.geektrust.entity;

import lombok.Data;

@Data
public class Driver { // This class can be extended further to store more driver info like (driver info, vehicle info, ratings)
    private String id;
    private Double xCoordinate;
    private Double yCoordinate;
}
