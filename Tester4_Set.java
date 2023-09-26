package com.Xworkz.Collefction1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tester4_Set {
    public static void main(String[] args) {

        //Abstraction
        // <> Generics helps to add similar type of data
        // Here ArrayList() is giving implementation
        Set<String> moviesName = new HashSet<>();
        //  Collection moviesName = new TreeSet();
        moviesName.add("KGF");
        moviesName.add("KGF 2");
        moviesName.add("pk");
        moviesName.add("Uppi");
        moviesName.add("jogi");
        moviesName.add("om");
        moviesName.add("Gadar");
        moviesName.add("Pathan");
        // moviesName.add(3, "pbk");
        moviesName.add(null);
        //moviesName.add(null);     nt accept more than one null value
     moviesName.add("KGF");   // set does not allow duplicate data



        for(Object movies : moviesName){
            System.out.println(movies);
        }

        System.out.println(moviesName.size());
        System.out.println(moviesName.remove("jogi"));
        System.out.println(moviesName.size());

    }
}
