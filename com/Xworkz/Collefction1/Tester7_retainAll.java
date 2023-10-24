package com.Xworkz.Collefction1;

import java.util.LinkedList;
import java.util.List;

public class Tester7_retainAll {

    public static void main(String[] args) {

        // Abstraction
        List<String> moviesName = new LinkedList<>();
        moviesName.add("KGF");
        moviesName.add("KGF 2");
        moviesName.add("pk");
        moviesName.add("Uppi");

        List<String> moviesName1 = new LinkedList<>();
        moviesName1.add("jogi");
        moviesName1.add("om");
        moviesName1.add("pk");
        moviesName1.add("Pathan");

        moviesName1.retainAll(moviesName);   // it will take common data and remove it , display other elements

        System.out.println("movesName data" + moviesName);
        System.out.println("moviesName1 data "+moviesName1);

    }
}
