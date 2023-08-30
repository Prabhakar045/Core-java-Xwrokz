package com.xworkz.ExceptionHandling;

public class Tester1 {
    public static void main(String[] args) {

        System.out.println("main started ");
        try{
            //  NullPointerException
            String str = null;
            int length = str.length();
        }catch (NullPointerException e){
            System.out.println("NullPointerException: " + e.getMessage());
        }

        System.out.println("main ended");
    }
}
