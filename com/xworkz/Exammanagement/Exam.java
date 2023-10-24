package com.xworkz.Exammanagement;

import lombok.Data;

@Data
public class Exam {

    HallTicket hallTicket;
    private int fees;

//    public Exam( HallTicket hallTicket){this.hallTicket=hallTicket};


    public boolean allow(){
        boolean isAllowed=false;
        HallTicket ticket;
        if(fees >=1700) {
            System.out.println("Fees paid... pls collect ur hallticket");
            if (hallTicket != null) {
                System.out.println("Ticket details are fine... initialize hallticket");
                this.hallTicket = hallTicket;
                this.hallTicket.displayDetails();
                isAllowed = true;
                System.out.println("Details are fine... you are allowed to write the exam");
            } else {
                System.out.println("No HallTicket found");
            }
        }
        else {
            System.out.println("Rokka katto appi");
        }
        return false;

    }


}
