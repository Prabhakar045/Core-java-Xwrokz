package com.xworkz.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        System.out.println("main started");


        try {
            String[] str = new String[2];    //ArrayIndexOutOfBoundsException
            str[0] = "pbk";
            str[1] = "rom";
            str[2] = "abc";
        } catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("size is full");
        }

        System.out.println("main ended");


    }
}
