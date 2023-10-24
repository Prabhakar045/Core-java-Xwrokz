package com.xworkz.ExceptionHandling;

public class Tester12_block3 {
    static{

        System.out.println("invoked static block");
    }

    {

        System.out.println("invoked instance block");
    }

    public  static void method(){
        System.out.println("invoked method");
    }
}
