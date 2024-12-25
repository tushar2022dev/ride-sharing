package com.example.geektrust.entity;

import com.example.geektrust.enums.RideState;
import lombok.Data;

@Data
public class Ride {   // This class can also be used as activity for drivers and riders. We can store vehicle info etc
    private String id;
    private String riderId;
    private String driverId;
    private RideState state;
    private Double startXCoordinate;
    private Double startYCoordinate;
    private Double endXCoordinate;
    private Double endYCoordinate;
    private Double timeTaken;
    private Double billAmount;
}
