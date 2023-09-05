package com.xworkz.ExceptionHandling;

public class Tester6 {

    // .class file loading in memory using foeName() method
    public static void main(String[] args) {
        System.out.println("main started");

        try {
          Class exceptionTester =  Class.forName("com.xworkz.ExceptionHandling.Tester6");
            System.out.println("Loaded successfully "+exceptionTester);
        }catch (ClassNotFoundException cnf){
            cnf.printStackTrace();
        }

        System.out.println("main ended");
    }
}
