package com.xworkz.casting;

public class Export {

    public static void main(String[] args) {

        int i = 125;
        System.out.println("Original int: " + i);

        // Widening Type Casting (Safe)
        long iAsLong = i; // Casting int to long,
        System.out.println("After widening (long): " + iAsLong);

        // Narrowing Type Casting (May result in data loss)
        short iAsShort = (short) i; // Casting int to short, narrowing conversion
        System.out.println("After narrowing (short): " + iAsShort);

        // Widening Type Casting  or Up casting
        byte b = 12;
        int isInt = b;
        System.out.println("After widening " +b);

        double isDouble = b;
        System.out.println(isDouble);

        long isLong = b;
        System.out.println(isLong);

        short isShort = b;
        System.out.println(isShort);

        float isFloat = b ;
        System.out.println(isFloat);

        // Narrowing Type Casting or Down casting
        double d = 12.00;

        int isInt1 = (int)d;
        System.out.println("Down casting "+isInt1);








    }
}
