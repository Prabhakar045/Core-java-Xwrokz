package com.xworkz.ExceptionHandling;

public class tester9 {

    public static void main(String[] args)  {
        System.out.println("main started");
        System.out.println("main ended");
    }

    private static void method1() throws ClassNotFoundException {
        System.out.println("method1 started");

        method2();
        System.out.println("method1 ended");
    }

    private static void method2() throws ClassNotFoundException {
        System.out.println("method2 started");
        method3();
        System.out.println("method2 ended");
    }

    private static void method3() throws ClassNotFoundException {
        System.out.println("method3 started");

        Class.forName("com.xworkz.ExceptionHandling.Teste9");


        System.out.println("method3 ended ");
    }
}
