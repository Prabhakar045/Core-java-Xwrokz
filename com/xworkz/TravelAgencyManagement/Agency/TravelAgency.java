package com.xworkz.TravelAgencyManagement.Agency;

import com.xworkz.TravelAgencyManagement.Bus.AbhiBus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class TravelAgency {

    public AbhiBus abhiBus;
    String name = "Kattimani Travels";

    public TravelAgency(AbhiBus abhiBus) {
        this.abhiBus = abhiBus;
    }


    public boolean bookingTickets(int noOfTickets) {

        boolean isBookingIsDone = false;

        if (abhiBus != null) {
            boolean isConditionGood = this.abhiBus.goodCondition();
            if (isConditionGood) { // Changed the condition here
                if (noOfTickets <= this.abhiBus.minBooking()) {
                    System.out.println("No of tickets booked: " + noOfTickets);
                    isBookingIsDone = true;
                    System.out.println(name);
                } else {
                    System.out.println("Booking not possible. Number of tickets exceeds minimum booking limit.");
                }
            } else {
                System.out.println("Bus condition is not good, booking not possible.");
            }
        } else {
            System.out.println("Booking not possible.");
        }
        return isBookingIsDone;

    }
}
