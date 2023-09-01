package com.xworkz.ottplatform.bankAcoount;


import java.time.LocalDate;

public class BankAccountTester {
    public static void main(String[] args) {

        BankAccount myAccount = new SavingAccount();       // Polymorphism, reference is parent type, and object creation type is child type
        BankAccount myAcurrent1 = new CurrentAccount();    // Without inheritance, we cannot achieve polymorphism
//        BankAccount myAcurrent2 = new BankAccount();       // this is not polymorphism
        BankAccount friendAccount = new CurrentAccount();
        BankAccount friendAccount1 = new CurrentAccount();
        BankAccount friendAccount2 = new CurrentAccount();
        BankAccount friendAccount3 = new CurrentAccount();


        myAccount.credit(1000.00);
        System.out.println("Account amount credited : " + LocalDate.now()+"\n"+ myAccount.getBalance());

        myAccount.debit(200.00);
        System.out.println("Account balance: " + LocalDate.now()+ "\n" + myAccount.getBalance());

        // transeferring amount to frnd
        myAccount.transfer(100.00, friendAccount);
        System.out.println("Friend's Account Balance: " + friendAccount.getBalance());

        myAccount.transfer(200.00, friendAccount1);
        System.out.println("Friend's Account Balance: " + friendAccount1.getBalance());

        myAccount.transfer(300.00, friendAccount2);
        System.out.println("Friend's Account Balance: " + friendAccount2.getBalance());

//        myAccount.transfer(300.00, friendAccount3);
//        System.out.println("Friend's Account Balance: " + friendAccount3.getBalance());

        System.out.println("My Account Balance: " + myAccount.getBalance());

//
//        double interest = ((SavingAccount) myAccount).getRateOfInterest();
//        myAccount.credit(interest);
//        System.out.println(" intrest credit agiddu " + interest);
//        System.out.println(" intrest rate jothe + previous balance   " + myAccount.getBalance());



        System.out.println("Calculating rate of interest on credit");
        SavingAccount savingsAccount=new SavingAccount();
        savingsAccount.credit(1000.00);
        System.out.println("The balance after credit:"+savingsAccount.getBalance());
        savingsAccount.getRateOfInterest();
        System.out.println("The total balance of interest account is:"+ savingsAccount.getBalance());


    }
}



