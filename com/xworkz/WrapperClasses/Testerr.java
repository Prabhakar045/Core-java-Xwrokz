package com.xworkz.WrapperClasses;

public class Testerr {

    public static void main(String[] args) {
        int i=90;

        // Integer age =1;   //Boxing    without using new keyword or literals (Integer)
        Integer age = new Integer(i);    // with using new keyword
        int age1 = age;


        System.out.println(age1);

        // Double boxing and unboxing
        double d = 3.14;
        Double doubleObj = new Double(d); // Boxing
        double doublePrimitive = doubleObj; // Unboxing
        System.out.println("Double: " + doublePrimitive);

        // Boolean boxing and unboxing
        boolean b = true;
        Boolean booleanObj = new Boolean(b); // Boxing
        boolean booleanPrimitive = booleanObj; // Unboxing
        System.out.println("Boolean: " + booleanPrimitive);

        // Character boxing and unboxing
        char c = 'A';
        Character charObj = new Character(c); // Boxing
        char charPrimitive = charObj; // Unboxing
        System.out.println("Character: " + charPrimitive);

        double d1= 2.12;
        Double dboxing = new Double(d1);
        double unBoxing = dboxing;
        System.out.println(unBoxing);


    }
}
