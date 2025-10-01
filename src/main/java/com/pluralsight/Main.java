package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Creating an object
        CellPhone phone = new CellPhone();

        System.out.print("Please enter your phones serial number: ");
        phone.setSerialNumber(scan.nextLine());

        System.out.print("What model is the phone? ");
        phone.setModel(scan.nextLine());

        System.out.print("What is the carrier? ");
        phone.setCarrier(scan.nextLine());

        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(scan.nextLine());

        System.out.print("Who is the owner? ");
        phone.setOwner(scan.nextLine());

        //printing using getters
        System.out.println("\n=== Phone Information ===");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

    }
}
