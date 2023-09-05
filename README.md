
-------------------------------------  Exception Handling -----------------------------------------------------
exception is class in java 
Exception have throwable property.
JVM: The Java Virtual Machine (JVM) itself can throw exceptions. For example, if your program tries to divide by zero or access 
an array index out of bounds, the JVM will throw exceptions like ArithmeticException or ArrayIndexOutOfBoundsException.


Types of Exception--

1. default-Handler -> (JVM 1st check for user defined exception , if not available in code then it use default  exception)
@. User-defined Exception Handler ->  (Ex:- catch() )



Exception propogation  --> trasfering exception from one method to another method 

package com.xworkz.ExceptionHandling;

public class tester9 {

    public static void main(String[] args)  {
        System.out.println("main started");
        try {
            method1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
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
