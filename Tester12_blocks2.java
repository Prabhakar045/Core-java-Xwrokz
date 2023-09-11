package com.xworkz.ExceptionHandling;

public class Tester12_blocks2 {

    public static void main(String[] args) {
        System.out.println("main started ");

        Tester12_blocks2 tester = new Tester12_blocks2();


        System.out.println("main ended ");
    }

    {
        System.out.println("first instance block invoked ");
    }

    static{
        System.out.println("second static  block invoked ");
    }

    static{
        System.out.println(" Third static block invoked ");
    }
}
