package com.Xworkz.Collefction1;

import java.util.LinkedList;
import java.util.List;

public class Tester6_All_collection_method {
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
        moviesName1.add("Gadar");
        moviesName1.add("Pathan");

        moviesName.addAll(moviesName1);   // bulk operation

        moviesName.remove("KGF 2");   // remove   , method overloading
        moviesName.removeAll(moviesName1);   // remove All


        for (Object movies : moviesName) {
            System.out.println(movies);
        }
        System.out.println("Size: " + moviesName.size());

        //moviesName1.clear();

        // Check if "jogi" is in the list
        boolean containsJogi = moviesName.contains("jogi");
        System.out.println("Does moviesName contain jogi " + containsJogi);

        boolean containsJ = moviesName.containsAll(moviesName);
        System.out.println(containsJ);

    }
}
