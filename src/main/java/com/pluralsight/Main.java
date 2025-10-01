package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your phones serial number: ");
        String serialNumber = scan.nextLine();

        System.out.print("What model is the phone? ");
        String model = scan.nextLine();

        System.out.print("What is the carrier? ");
        String carrier = scan.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = scan.nextLine();

        System.out.print("Who is the owner? ");
        String owner = scan.nextLine();
    }
}
