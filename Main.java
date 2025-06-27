package com.parkinglot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(3, 3, 2); // Small, Large, Oversize
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Parking Lot Management System");
        System.out.println("Commands: enter [type] [plate], exit [plate], status, quit");

        while (true) {
            System.out.print("> ");
            command = scanner.nextLine();
            String[] parts = command.split(" ");

            if (parts[0].equalsIgnoreCase("enter") && parts.length == 3) {
                Vehicle vehicle = new Vehicle(parts[2], VehicleType.valueOf(parts[1].toUpperCase()));
                parkingLot.parkVehicle(vehicle);
            } else if (parts[0].equalsIgnoreCase("exit") && parts.length == 2) {
                parkingLot.removeVehicle(parts[1]);
            } else if (parts[0].equalsIgnoreCase("status")) {
                parkingLot.displayStatus();
            } else if (parts[0].equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
        scanner.close();
    }
}