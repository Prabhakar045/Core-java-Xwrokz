package com.xworkz.Exammanagement;


class SupplementaryExam extends Exam{
    public int noOfAttempts;
    public SupplementaryExam(HallTicket ticket){
        this.hallTicket=ticket;
    }
    @Override        // this called as Runtime polymorphism
    public boolean allow(){
        System.out.println("");
        if(noOfAttempts>1){
            boolean isAllowed=super.allow();
            return isAllowed;
            //return super.allow();
        }
        return false;
    }
}
