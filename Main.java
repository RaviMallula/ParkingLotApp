package com.parkinglot; // Package declaration

import java.util.Scanner; // Import Scanner to get input from user

public class Main {
    public static void main(String[] args) {
        // Create a parking lot with 3 small, 3 large, and 2 oversize slots
        ParkingLot parkingLot = new ParkingLot(3, 3, 2);

        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        String command; // Variable to hold the user command

        // Display instructions
        System.out.println("Parking Lot Management System");
        System.out.println("Commands: enter [type] [plate], exit [plate], status, quit");

        // Infinite loop to keep program running
        while (true) {
            System.out.print("> "); // Prompt symbol
            command = scanner.nextLine(); // Read the whole input line
            String[] parts = command.split(" "); // Split command by space

            // Check if user typed "enter" with 3 parts (enter type plate)
            if (parts[0].equalsIgnoreCase("enter") && parts.length == 3) {
                // Create a vehicle with plate and type
                Vehicle vehicle = new Vehicle(parts[2], VehicleType.valueOf(parts[1].toUpperCase()));
                // Try to park the vehicle
                parkingLot.parkVehicle(vehicle);

                // Check if user typed "exit" with plate number
            } else if (parts[0].equalsIgnoreCase("exit") && parts.length == 2) {
                parkingLot.removeVehicle(parts[1]); // Remove vehicle by plate

                // Show current parking status
            } else if (parts[0].equalsIgnoreCase("status")) {
                parkingLot.displayStatus();

                // Quit the program
            } else if (parts[0].equalsIgnoreCase("quit")) {
                break; // Exit loop

                // If command doesn't match any of above
            } else {
                System.out.println("Invalid command.");
            }
        }

        scanner.close(); // Close scanner to free resources
    }
}