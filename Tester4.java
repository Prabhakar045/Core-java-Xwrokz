package com.xworkz.ExceptionHandling;

public class Tester4 {

    public static void main(String[] args) {
        String pgnNo ="8431330277pbk";

        try{
            System.out.println(Long.parseLong(pgnNo));
        }catch (NumberFormatException nf){
            nf.printStackTrace();
        }
    }
}
