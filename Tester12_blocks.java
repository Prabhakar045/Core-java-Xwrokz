package com.xworkz.ExceptionHandling;

public class Tester12_blocks {


    public  Tester12_blocks(){
        System.out.println("constructor invoked ");
    }
    public static void main(String[] args) {
        System.out.println("main started ");

        Tester12_blocks tester = new Tester12_blocks();
        Tester12_blocks.method();

        System.out.println("main ended ");
    }

    public static void method(){
        System.out.println("invoked method");
    }

    {
        System.out.println("invoked , static block");
    }

}
