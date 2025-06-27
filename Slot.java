package com.parkinglot;

public class Slot {
    private VehicleType type;
    private String id;
    private Vehicle vehicle;

    public Slot(VehicleType type, String id) {
        this.type = type;
        this.id = id;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public String getId() {
        return id;
    }

    public VehicleType getType() {
        return type;
    }
}