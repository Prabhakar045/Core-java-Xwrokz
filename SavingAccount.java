package com.xworkz.ottplatform.bankAcoount;

public class SavingAccount extends  BankAccount{

//        public double balance;
        public double interestRate = 4.0;

        public SavingAccount(){

        }

        public SavingAccount(double minBalance){

        }

        public void getRateOfInterest() {
        double interest = (getBalance()* interestRate) / 100;
        System.out.println(" intrest: " +interest);
        credit(interest);
    }

//        public double getRateOfInterest() {
//            double interest = balance * interestRate / 100;
//            System.out.println("intrest rate enda bandiro amount "+interest);
//            return interest;
//        }
//        public void credit(double interest) {
//            balance = balance + interest;
//        }


//    public void getRateOfInterest() {
//
//    }
//
//    public void setInterestRate() {
//
//    }
}

