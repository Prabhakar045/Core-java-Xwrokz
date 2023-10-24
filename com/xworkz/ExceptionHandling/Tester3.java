package com.xworkz.ExceptionHandling;

public class Tester3 {

    public static void main(String[] args) {

        try{
            int num = 45/0;
        }catch (ArithmeticException e){
            System.out.println("cannot devide by zero");
        }
    }
}
