package com.xworkz.ExceptionHandling;

public class Tester8 {
    public static void main(String[] args) {
        System.out.println("main started");

        try {
            Class.forName("com.xworkz.ExceptionHandling.Tester8");
        }catch (ClassNotFoundException cnf){
            cnf.printStackTrace();
        }

        System.out.println("main ended");
    }
}
