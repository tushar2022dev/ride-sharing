package com.example.geektrust.repository;

import com.example.geektrust.entity.Driver;
import com.example.geektrust.exception.DriverAlreadyPresentException;

import java.util.*;

public class DriverRepository {

    private final Map<String, Driver> driverMap = new HashMap<>();

    public Optional<Driver> findById(String id) {
        return Optional.ofNullable(driverMap.get(id));
    }

    public void addDriver(Driver driver) throws DriverAlreadyPresentException {
        if(driver == null || driver.getId() == null){
            throw new IllegalArgumentException("Driver or Driver Id cannot be null");
        }
        if(driverMap.containsKey(driver.getId())){
            throw new DriverAlreadyPresentException("Driver with ID '" + driver.getId() + "' is already present.");
        }else {
            driverMap.put(driver.getId(),driver);
        }
    }

    public List<Driver> findAll(){
        return driverMap.values().stream().toList();
    }
}
