package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // First phone: user input
        CellPhone userPhoneOne = new CellPhone();

        System.out.print("What is the serial number? ");
        int serialNumber = scan.nextInt();
        scan.nextLine(); // consume leftover newline
        userPhoneOne.setSerialNumber(serialNumber);

        System.out.print("What model is the phone? ");
        String model = scan.nextLine();
        userPhoneOne.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scan.nextLine();
        userPhoneOne.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scan.nextLine();
        userPhoneOne.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner? ");
        String owner = scan.nextLine();
        userPhoneOne.setOwner(owner);

        // Second phone: hardcoded
        CellPhone userPhoneTwo = new CellPhone(784444, "Landline", "Simpsons", "7277777885", "Moes Bar");

        // Display both phones
        display(userPhoneOne);
        display(userPhoneTwo);

        // Phones prank call each other using overloaded dial()
        userPhoneOne.dial(userPhoneTwo);
    }

    public static void display(CellPhone phone) {
        System.out.println("\n=== Phone Info ===");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println();
    }
}