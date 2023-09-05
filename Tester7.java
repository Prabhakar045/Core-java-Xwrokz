package com.xworkz.ExceptionHandling;

public class Tester7 {
    public static void main(String[] args) {
        System.out.println("main startted");

        try {
            Class tester = Class.forName("com.xworkz.ExceptionHandling.Tester7");
            System.out.println("Loaded successfully "+tester);
        }catch (ClassNotFoundException cnf){
            cnf.printStackTrace();

        }

        System.out.println("main ended");

    }
}
