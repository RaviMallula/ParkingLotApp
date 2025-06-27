package com.parkinglot; // Package declaration

import java.util.*; // Import utilities (Map, Queue, etc.)

public class ParkingLot {
    // Available slots for each vehicle type
    private Map<VehicleType, Queue<Slot>> availableSlots = new HashMap<>();

    // Tracks filled slots by vehicle's plate number
    private Map<String, Slot> filledSlots = new HashMap<>();

    // Constructor: sets up the parking lot with a number of each slot type
    public ParkingLot(int small, int large, int oversize) {
        initSlots(VehicleType.SMALL, small);    // Initialize small slots
        initSlots(VehicleType.LARGE, large);    // Initialize large slots
        initSlots(VehicleType.OVERSIZE, oversize); // Initialize oversize slots
    }

    // Helper method to create slots for each vehicle type
    private void initSlots(VehicleType type, int count) {
        Queue<Slot> slots = new LinkedList<>(); // List of available slots

        for (int i = 1; i <= count; i++) {
            // Create a new slot with type and ID like S1, L1, O1
            String id = type.toString().charAt(0) + String.valueOf(i);
            slots.add(new Slot(type, id)); // Add slot to the list
        }

        availableSlots.put(type, slots); // Save the slots to map
    }

    // Method to park a vehicle
    public void parkVehicle(Vehicle vehicle) {
        // Get list of available slots for the vehicle type
        Queue<Slot> slots = availableSlots.get(vehicle.getType());

        // If no slots are available, show a message
        if (slots == null || slots.isEmpty()) {
            System.out.println("No available slot for vehicle type: " + vehicle.getType());
            return;
        }

        // Get a free slot from the queue
        Slot slot = slots.poll();
        slot.assignVehicle(vehicle); // Assign the vehicle to the slot

        // Save this in the filled slots map
        filledSlots.put(vehicle.getPlateNumber(), slot);

        // Print where the vehicle was parked
        System.out.println("Vehicle parked at slot: " + slot.getId());
    }

    // Method to remove a vehicle by its plate number
    public void removeVehicle(String plateNumber) {
        // Remove the slot associated with this plate number
        Slot slot = filledSlots.remove(plateNumber);

        // If vehicle not found, print a message
        if (slot == null) {
            System.out.println("Vehicle not found.");
            return;
        }

        // Free up the slot
        slot.removeVehicle();

        // Add the slot back to available ones
        availableSlots.get(slot.getType()).add(slot);

        System.out.println("Vehicle removed from slot: " + slot.getId());
    }

    // Show all filled slots
    public void displayStatus() {
        System.out.println("Current status of Parking Lot:");
        for (Map.Entry<String, Slot> entry : filledSlots.entrySet()) {
            // Show vehicle plate and where it's parked
            System.out.println("Plate: " + entry.getKey() + ", Slot: " + entry.getValue().getId());
        }
    }
}