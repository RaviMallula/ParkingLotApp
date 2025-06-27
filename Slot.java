package com.parkinglot;

public class Slot {
    private VehicleType type;  // Type of vehicle this slot supports
    private String id;         // ID like S1, L1, O1
    private Vehicle vehicle;   // Vehicle currently parked here

    // Constructor to create a slot with type and id
    public Slot(VehicleType type, String id) {
        this.type = type;
        this.id = id;
    }

    // Assign a vehicle to this slot
    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // Remove vehicle from this slot
    public void removeVehicle() {
        this.vehicle = null;
    }

    // Get ID of the slot (e.g., S1)
    public String getId() {
        return id;
    }

    // Get what type of vehicle this slot supports
    public VehicleType getType() {
        return type;
    }
}
