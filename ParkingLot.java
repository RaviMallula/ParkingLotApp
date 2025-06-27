package com.parkinglot;

import java.util.*;

public class ParkingLot {
    private Map<VehicleType, Queue<Slot>> availableSlots = new HashMap<>();
    private Map<String, Slot> filledSlots = new HashMap<>();

    public ParkingLot(int small, int large, int oversize) {
        initSlots(VehicleType.SMALL, small);
        initSlots(VehicleType.LARGE, large);
        initSlots(VehicleType.OVERSIZE, oversize);
    }

    private void initSlots(VehicleType type, int count) {
        Queue<Slot> slots = new LinkedList<>();
        for (int i = 1; i <= count; i++) {
            slots.add(new Slot(type, type.toString().charAt(0) + String.valueOf(i)));
        }
        availableSlots.put(type, slots);
    }

    public void parkVehicle(Vehicle vehicle) {
        Queue<Slot> slots = availableSlots.get(vehicle.getType());
        if (slots == null || slots.isEmpty()) {
            System.out.println("No available slot for vehicle type: " + vehicle.getType());
            return;
        }

        Slot slot = slots.poll();
        slot.assignVehicle(vehicle);
        filledSlots.put(vehicle.getPlateNumber(), slot);
        System.out.println("Vehicle parked at slot: " + slot.getId());
    }

    public void removeVehicle(String plateNumber) {
        Slot slot = filledSlots.remove(plateNumber);
        if (slot == null) {
            System.out.println("Vehicle not found.");
            return;
        }

        slot.removeVehicle();
        availableSlots.get(slot.getType()).add(slot);
        System.out.println("Vehicle removed from slot: " + slot.getId());
    }

    public void displayStatus() {
        System.out.println("Current status of Parking Lot:");
        for (Map.Entry<String, Slot> entry : filledSlots.entrySet()) {
            System.out.println("Plate: " + entry.getKey() + ", Slot: " + entry.getValue().getId());
        }
    }
}