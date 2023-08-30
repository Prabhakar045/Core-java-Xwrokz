package com.xworkz.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester2 {

    public static void main(String[] args) {
        System.out.println("main started");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        int name = 0;
        try {
            name = sc.nextInt();
        } catch (
                InputMismatchException e) {                                 // InputMismatchException
            System.out.println("please provide int value ");
        }
        System.out.println("name is " + name);

        System.out.println("main ended ");
    }
}
