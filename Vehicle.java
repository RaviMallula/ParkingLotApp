package com.parkinglot;// Package declaration

public class Vehicle {
    private String plateNumber;  // Vehicle's plate number
    private VehicleType type;    // Type of the vehicle (SMALL, LARGE, etc.)

    // Constructor to set plate and type
    public Vehicle(String plateNumber, VehicleType type) {
        this.plateNumber = plateNumber;
        this.type = type;
    }

    // Get the vehicle's plate number
    public String getPlateNumber() {
        return plateNumber;
    }

    // Get the vehicle's type
    public VehicleType getType() {
        return type;
    }
}
