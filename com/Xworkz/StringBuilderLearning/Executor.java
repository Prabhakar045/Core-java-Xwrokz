package com.Xworkz.StringBuilderLearning;

public class Executor {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Prabhakar k");

        System.out.println(sb);

        System.out.println(sb.charAt(0));    // char at index 0

        System.out.println(sb.length());

        sb.setCharAt(1, 'K');       // it used to replace character
        System.out.println(sb);


        sb.insert(0,"p");     // you can insert newcharcter at any position
        System.out.println(sb);

        sb.delete(1,2);               // delete an String from start Index - end index (exclusive)
        System.out.println(sb);

        sb.append("a");               // used append element at last index
        sb.append("t");
        sb.append("t");
        System.out.println(sb);
    }
}
