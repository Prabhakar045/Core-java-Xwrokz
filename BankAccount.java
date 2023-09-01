package com.xworkz.ottplatform.bankAcoount;

public class BankAccount {

   private double balance;


    public  BankAccount(double balance){
        this.balance=balance;
    }

    public  BankAccount(){

    }

    public void credit(double amount){
        if(amount > 0){
            this.balance=balance+amount;
        }else{
            System.out.println("Amoutn must be greater than 0");
        }
    }

    public void debit(double amount){
        if(amount<this.balance){
            this.balance=balance-amount;
        }else {
            System.out.println("amount ella ");
        }
    }


    //    here BankAccount is user defined data type and it is class type
    public void transfer(double amount, BankAccount beneficiaryAccount) {
        if (amount <= balance) {
            this.debit(amount);
            beneficiaryAccount.credit(amount);
            System.out.println(amount + " amount transfer ayatu  target account  ge successfully ");
        } else {
        }
    }

    public  double getBalance(){
        return  balance;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
