package com.xworkz.TravelAgencyManagement;

import com.xworkz.TravelAgencyManagement.Agency.TravelAgency;
import com.xworkz.TravelAgencyManagement.Bus.AbhiBus;
import com.xworkz.TravelAgencyManagement.Bus.VrlImpl.VrlImpl;

import java.util.Scanner;

public class AbhiBusTester {
    public static void main(String[] args) {
        AbhiBus abhiBus = new VrlImpl();

        TravelAgency agency = new TravelAgency(abhiBus);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tickets to book ");
        int noOfTickets = sc.nextInt();

        System.out.print("bus good condition? true or false ");
        boolean condition = sc.nextBoolean();

        // Here you can call methods on the TravelAgency object to interact with the AbhiBus
        boolean isBookingDone = agency.bookingTickets(noOfTickets);
        agency.bookingTickets(noOfTickets);

        if (isBookingDone == true) {
            System.out.println("Tickets booked successfully!");
        } else {
            System.out.println("Booking not possible.");
        }

    }
}

